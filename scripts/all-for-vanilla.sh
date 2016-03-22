#!/bin/bash

block=$1
texture=$2
parent_block=$3
title=$4
name=$5

originalPath=../src/main/java/net/minecraft/buildiblocks/block
originalName=WhiteWool


ruby ./generate-json.rb -t stairs -n ${block}_stairs -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture} -v
sed -e s/WhiteWoolStairs/${name}/g ${originalPath}/stairs/${originalName}Stairs.java > ${originalPath}/stairs/${name}Stairs.java
sed -i.bak s/White/${title}/g ${originalPath}/stairs/${name}Stairs.java
rm ${originalPath}/stairs/${name}Stairs.java.bak

# ruby ./generate-json.rb -t wall -n ${block}_wall -o texture_name=${texture} -v
# ruby ./generate-json.rb -t slab -n ${block}_slab -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture},parent_model=${parent_block} -v
