colors = %w(lime pink gray silver cyan purple blue brown green red black)

colors.each do |color|
  capname = color.capitalize
  `ruby generate-blocks.rb -n "#{capname} Clay Tile" -s wall -p "BlockList.clayTile" -x clay_tile_#{color} -r tile -c #{color} -R "Blocks.STAINED_HARDENED_CLAY"`
end