#!/bin/bash

block=$1
texture=$2
parent_block=$3
title=$4
name=$5

ruby ./generate-json.rb -t stairs -n ${block}_stairs -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture} -v
cp ../src/main/java/net/minecraft/buildiblocks/block/stairs/WhiteWoolStairs.java ../src/main/java/net/minecraft/buildiblocks/block/stairs/${name}.java
sed -e s/WhiteWoolStairs/${name}/g ../src/main/java/net/minecraft/buildiblocks/block/stairs/WhiteWoolStairs.java > ../src/main/java/net/minecraft/buildiblocks/block/stairs/${name}.java
sed -i.bak s/White/${title}/g ../src/main/java/net/minecraft/buildiblocks/block/stairs/${name}.java

# ruby ./generate-json.rb -t wall -n ${block}_wall -o texture_name=${texture} -v
# ruby ./generate-json.rb -t slab -n ${block}_slab -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture},parent_model=${parent_block} -v
