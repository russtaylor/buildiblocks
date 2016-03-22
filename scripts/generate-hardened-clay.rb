colors = %w(orange magenta light_blue yellow lime pink gray silver cyan purple blue brown green red black)

colors.each do |color|
  capColor = color.capitalize
  upperColor = color.upcase
  puts `./all-for-vanilla.sh #{color}_hardened_clay hardened_clay_stained_#{color} #{color}_hardened_clay "#{capColor} Stained Clay" #{capColor}HardenedClay #{color}HardenedClay stained_hardened_clay #{upperColor}`
end
