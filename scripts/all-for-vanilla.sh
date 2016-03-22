#!/bin/bash

block=$1
texture=$2
parent_block=$3
title=$4
name=$5

originalPath=../src/main/java/net/minecraft/buildiblocks/block
originalName=WhiteWool

# Generate Walls
ruby ./generate-json.rb -t stairs -n ${block}_stairs -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture} -v
sed -e s/${originalName}Stairs/${name}Stairs/g ${originalPath}/stairs/${originalName}Stairs.java > ${originalPath}/stairs/${name}Stairs.java
sed -i.bak "s/White Wool/${title}/g" "${originalPath}/stairs/${name}Stairs.java"
sed -i.bak s/white_wool_stairs/${block}_stairs/g ${originalPath}/stairs/${name}Stairs.java
rm ${originalPath}/stairs/${name}Stairs.java.bak

# ruby ./generate-json.rb -t wall -n ${block}_wall -o texture_name=${texture} -v

# Generate Slabs
ruby ./generate-json.rb -t slab -n ${block}_slab -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture},parent_model=${parent_block} -v
sed -e s/${originalName}Slab/${name}Slab/g ${originalPath}/slabs/${originalName}Slab.java > ${originalPath}/slabs/${name}Slab.java
sed -i.bak "s/White Wool/${title}/g" "${originalPath}/slabs/${name}Slab.java"
sed -i.bak s/white_wool_slab/${block}_slab/g ${originalPath}/slabs/${name}Slab.java
rm ${originalPath}/slabs/${name}Slab.java.bak
