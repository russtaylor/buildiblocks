#
# A script for generating blocks (including the applicable Java Code)
#

require 'optparse'

color_options = %w(white orange magenta light_blue yellow lime pink gray silver cyan purple blue brown green red black)

options = {}
optionParser = OptionParser.new do |opts|
  opts.banner = 'Usage: generate-blocks.rb [options]'

  opts.on('-n', '--name NAME', 'The name of the block to generate.') do |name|
    options['name'] = name
  end

  opts.on('-c', '--color COLOR', 'The \'dye\' color to use for the block.') do |color|
    options['color'] = color
  end

  opts.on('-b', '--block', 'Whether or not to generate the associated block as well.') do |block|
    options['block'] = block
  end
end