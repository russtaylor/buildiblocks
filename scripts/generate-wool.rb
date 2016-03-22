colors = %w(white orange magenta light_blue yellow lime pink gray silver cyan purple blue brown green red black)

colors.each do |color|
  capColor = color.capitalize
  upperColor = color.upcase
  puts `./all-for-vanilla.sh #{color}_wool wool_colored_#{color} #{color}_wool "#{capColor} Wool" #{capColor}Wool #{color}Wool wool #{upperColor}`
end
