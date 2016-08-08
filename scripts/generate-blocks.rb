#
# A script for generating blocks (including the applicable Java Code)
#

require 'optparse'
require 'fileutils'

class BlockGenerator
  COLOR_OPTIONS = %w(white orange magenta light_blue yellow lime pink gray silver cyan purple blue brown green red black)
  TYPES = %w(block stairs wall slab)

  JSON_GENERATE_COMMAND = "ruby #{Dir.pwd}/generate-json.rb"
  JSON_GENERATORS = {
      :block => '-t block -n [block] -x [texture]',
      :stairs => '-t stairs -n [block] -o bottom_texture_name=[texture],top_texture_name=[texture],side_texture_name=[texture]',
      :wall => '-t wall -n [block] -o texture_name=[texture]',
      :slab => '-t slab -n [block] -o bottom_texture_name=[texture],top_texture_name=[texture],side_texture_name=[texture],parent_model=[model]'
  }

  JAVA_TEMPLATE_PATH = './java-source/[type]/Template.java'
  DESTINATION_PATH = '../src/main/java/net/minecraft/buildiblocks/block/'

  JAVA_REPLACE_STRINGS = {
      :block => 'Class Name',
      :class => 'ClassName',
      :variable => 'className',
      :snake => 'class_name'
  }

  JAVA_SRC_LOCATION = '../src/main/java/net/minecraft/buildiblocks/'
  BLOCK_LIST = JAVA_SRC_LOCATION + 'block/BlockList.java'
  BLOCK_HANDLER = JAVA_SRC_LOCATION + 'block/BlockHandler.java'
  RECIPE_HANDLER = JAVA_SRC_LOCATION + 'recipe/RecipeHandler.java'
  LANG_FILE = '../src/main/resources/assets/buildiblocks/lang/en_US.lang'

  ADDER_STRING = 'adder'

  def initialize
    @has_enum = false
    get_options
    validate_options
    create_names
  end

  def get_options
    @options = {}
    optionParser = OptionParser.new do |opts|
      opts.banner = 'Usage: generate-blocks.rb [options]'

      opts.on('-n', '--name NAME', 'The name of the block to generate.') do |name|
        @options['name'] = name
      end

      opts.on('-c', '--color COLOR', 'The \'dye\' color to use for the block.') do |color|
        @options['color'] = color
      end

      opts.on('-m', '--meta META', 'The meta code to use for this block.') do |meta|
        @options['meta'] = meta
      end

      opts.on('-s', '--skip SKIP', 'A comma-separated list of the \'types\' to skip.') do |skip|
        @options['skip'] = skip.split(',')
      end

      opts.on('-p', '--parent PARENT', 'The parent block to use for this block.') do |parent|
        @options['parent'] = parent
      end

      opts.on('-j', '--parent-json PARENT_JSON', 'The \'parent\' json for the slab.') do |parent_json|
        @options['parent_json'] = parent_json
      end

      opts.on('-R', '--parent-recipe PARENT_RECIPE', 'The recipe source for the block.') do |parent_recipe|
        @options['parent_recipe'] = parent_recipe
      end

      opts.on('-e', '--enum ENUM', 'The ENUM for the source block.') do |enum|
        @options['enum'] = enum
      end

      opts.on('-x', '--texture TEXTURE', 'The texture to use for this block.') do |texture|
        @options['texture'] = texture
      end

      opts.on('-r', '--recipe RECIPE', 'The recipe type to use for the \'block\' itself.') do |recipe|
        @options['recipe'] = recipe
      end
    end
    optionParser.parse!
  end

  def validate_options
    if @options.nil?
      raise 'You must call get_options first, duh...'
    end
    unless @options.key? 'name'
      raise 'You\'ve gotta specify a name for your block, or else I can\'t help you.'
    end
    unless @options.key? 'parent'
      raise 'You must specify a parent block to use for the material.'
    end
    unless @options.key? 'texture'
      raise 'I need a texture!'
    end
    if @options.key? 'color' or @options.key? 'enum'
      @has_enum = true
    end
  end

  def create_names
    @strings = {}
    @strings[:block] = @options['name']
    @strings[:class] = @strings[:block].gsub(/\s/, '')
    @strings[:variable] = @strings[:class][0, 1].downcase + @strings[:class][1..-1]
    @strings[:snake] = @options['name'].gsub(/\s/, '_').downcase
  end

  def copy_java_template(type)
    original_file = JAVA_TEMPLATE_PATH.gsub(/\[type\]/, type)
    new_file = original_file.gsub(/java-source\//, '')
    new_file = DESTINATION_PATH.dup << new_file
    new_file = new_file.gsub(/Template/, get_type_classname(type))
    FileUtils.cp(original_file, new_file)
    new_file
  end

  def java_replace_options(file_path)
    file_content = File.read(file_path)
    JAVA_REPLACE_STRINGS.each do |key, replacement|
      file_content.gsub!(/#{replacement}/, @strings[key])
    end
    File.open(file_path, 'w') do |file|
      file.puts(file_content)
    end
  end

  def add_to_blocklist(type)
    cap_type = type.capitalize
    block_type = 'ModBlock'
    var_type = ''
    unless type == 'block'
      block_type << cap_type
      var_type = cap_type
    end
    block_string = "    public static #{block_type} #{@strings[:variable]}#{var_type};"
    gawkify(type, block_string, BLOCK_LIST)
  end

  def add_to_block_handler(type)
    type_classname = get_type_classname(type)
    variable_name = get_type_varname(type)
    block_string = "        BlockList.#{variable_name} = new #{type_classname}(#{@options['parent']}).register();"
    gawkify(type, block_string, BLOCK_HANDLER)
  end

  def add_to_recipe_handler(type)
    register_cap_type = type.capitalize
    varname = get_type_varname(type)
    type_classname = get_type_classname(type)
    recipe_type = type
    if type == 'block' and @options['recipe']
      recipe_type = @options['recipe']
      register_cap_type = @options['recipe'].capitalize
    end
    parent_string = get_parent_string(type)
    if type == 'block' and @options.key? 'parent_recipe'
      parent_string = @options['parent_recipe']
    end
    enum_string = get_enum_meta(type)
    block_string = "        register#{register_cap_type}(BlockList.#{varname}, #{parent_string}#{enum_string});"
    if type == 'slab'
      block_string = "        registerSlab(BlockList.#{varname}.getSingleSlab(), #{parent_string}#{enum_string});"
      unless enum_string.nil?
        block_string.gsub!(/getSingleSlab\(\)/, 'getSingleSlab(), 0')
      end
    end
    gawkify(recipe_type, block_string, RECIPE_HANDLER)
  end

  def get_parent_string(type)
    if @options.key? 'skip' and @options['skip'].include? 'block'
      return @options['parent']
    end
    if type == 'block'
      return @options['parent']
    end
    "BlockList.#{@strings[:variable]}"
  end

  def add_block_name(type)
    block_snake = get_type_snakename(type)
    block_name = get_type_name(type)
    block_string = "tile.#{block_snake}.name=#{block_name}"
    gawkify('word', block_string, LANG_FILE)
  end

  def get_enum_meta(type)
    if @has_enum
      if (@options.key? 'skip' and @options['skip'].include? 'block') or type == 'block'
        if @options.key? 'color'
          color = @options['color'].upcase
          return ", EnumDyeColor.#{color}.getMetadata()"
        end
        ", #{@options['enum']}"
      end
    end
  end

  def get_type_name(type)
    classname = @strings[:block].dup
    unless type == 'block'
      classname << ' ' << type.capitalize
    end
    classname
  end

  def get_type_classname(type)
    classname = @strings[:class].dup
    unless type == 'block'
      classname << type.capitalize
    end
    classname
  end

  def get_type_varname(type)
    varname = @strings[:variable].dup
    unless type == 'block'
      varname << type.capitalize
    end
    varname
  end

  def get_type_snakename(type)
    varname = @strings[:snake].dup
    unless type == 'block'
      varname << '_' << type
    end
    varname
  end

  def get_parent_model
    if @options.key? 'skip' and @options['skip'].include? 'block'
      return @options['parent_json']
    end
    "buildiblocks:#{@strings[:snake]}"
  end

  def generate_json(type)
    replaced = JSON_GENERATORS[type.to_sym].dup
    replaced = replaced.gsub(/\[block\]/, get_type_snakename(type))
    replaced = replaced.gsub(/\[texture\]/, @options['texture'])
    parent_model_string = get_parent_model
    replaced = replaced.gsub(/\[model\]/, parent_model_string)
    `#{JSON_GENERATE_COMMAND} #{replaced}`
  end

  def gawkify(type, string, file_name)
    `gawk -i inplace '/#{type}adder/ { print "#{string}"; print; next}1' #{file_name}`
  end

  def exec
    TYPES.each do |type|
      if @options.key? 'skip' and @options['skip'].include? type
        next
      end
      new_file = copy_java_template(type)
      java_replace_options(new_file)
      add_to_blocklist(type)
      add_to_block_handler(type)
      add_to_recipe_handler(type)
      add_block_name(type)
      generate_json(type)
    end
  end
end

block_gen = BlockGenerator.new
block_gen.exec