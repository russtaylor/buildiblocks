# colors = %w(lime pink gray silver cyan purple blue brown green red black orange white magenta light_blue yellow)
colors = %w(white)

colors.each do |color|
  capname = color.capitalize
  `ruby generate-blocks.rb -n "#{capname} Glass" -j block/ -s block,wall -p "Blocks.GLASS" -x glass_#{color} -c #{color} -R "Blocks.GLASS"`
  # `ruby generate-json.rb -t stairs -n #{color}_wool_stairs -v -o bottom_texture_name=wool_colored_#{color},top_texture_name=wool_colored_#{color},side_texture_name=wool_colored_#{color}`
  # `ruby generate-json.rb -t stairs -n #{color}_hardened_clay_stairs -v -o bottom_texture_name=hardened_clay_stained_#{color},top_texture_name=hardened_clay_stained_#{color},side_texture_name=hardened_clay_stained_#{color}`
end

# stones = %w(diorite andesite granite)
# stones.each do |stone|
#   `ruby generate-json.rb -t stairs -n polished_#{stone}_stairs -v -o bottom_texture_name=stone_#{stone}_smooth,top_texture_name=stone_#{stone}_smooth,side_texture_name=stone_#{stone}_smooth`
# end
