#!/bin/bash

block=$1
texture=$2
parent_block=$3

ruby ./generate-json.rb -t stairs -n ${block}_stairs -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture} -v
# ruby ./generate-json.rb -t wall -n ${block}_wall -o texture_name=${texture} -v
ruby ./generate-json.rb -t slab -n ${block}_slab -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture},parent_model=${parent_block} -v
