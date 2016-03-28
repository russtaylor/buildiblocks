#!/bin/bash

block=$1
texture=$2
parent_block=$3
title=$4
name=$5
varname=$6
material_name=$7

originalPath=../src/main/java/net/minecraft/buildiblocks/block
originalName=Obsidian
originalNameNoCap=obsidian

# Generate Block
# ruby ./generate-json.rb -t block -n ${block}


# Generate Stairs
ruby ./generate-json.rb -t stairs -n ${block}_stairs -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture} -v
sed -e s/${originalName}Stairs/${name}Stairs/g ${originalPath}/stairs/${originalName}Stairs.java > ${originalPath}/stairs/${name}Stairs.java
sed -i.bak "s/${originalName}/${title}/g" "${originalPath}/stairs/${name}Stairs.java"
sed -i.bak s/${originalNameNoCap}_stairs/${block}_stairs/g ${originalPath}/stairs/${name}Stairs.java
rm ${originalPath}/stairs/${name}Stairs.java.bak
gawk -i inplace -v varname="${varname}" '/stairadder/ { print "    public static ModBlockStairs "varname"Stairs;"; print; next}1' ${originalPath}/BlockList.java
gawk -i inplace -v varname="${varname}" -v blockname="${name}" -v matname="${material_name}" '/stairsadder/ { print "        BlockList."varname"Stairs = new "blockname"Stairs(Blocks."matname").register();"; print; next}1' ${originalPath}/BlockHandler.java
gawk -i inplace -v varname="${varname}" -v matname="${material_name}" '/stairsadder/ { print "        registerStair(BlockList."varname"Stairs, Blocks."matname");"; print; next}1' ${originalPath}/../recipe/RecipeHandler.java
gawk -i inplace -v blockname="${block}" -v blocktitle="${title}" '/wordadder/ {print "tile."blockname"_stairs.name="blocktitle" Stairs"; print; next}1' ../src/main/resources/assets/buildiblocks/lang/en_US.lang

# Generate Walls
# ruby ./generate-json.rb -t wall -n ${block}_wall -o texture_name=${texture} -v
# sed -e s/${originalName}Wall/${name}Wall/g ${originalPath}/walls/${originalName}Wall.java > ${originalPath}/walls/${name}Wall.java
# sed -i.bak "s/${originalName}/${title}/g" "${originalPath}/walls/${name}Wall.java"
# sed -i.bak s/${originalNameNoCap}_wall/${block}_wall/g ${originalPath}/walls/${name}Wall.java
# rm ${originalPath}/walls/${name}Wall.java.bak
# gawk -i inplace -v varname="${varname}" '/walladder/ { print "    public static ModBlockWall "varname"Wall;"; print; next}1' ${originalPath}/BlockList.java
# gawk -i inplace -v varname="${varname}" -v blockname="${name}" -v matname="${material_name}" '/walladder/ { print "        BlockList."varname"Wall = new "blockname"Wall(Blocks."matname").register();"; print; next}1' ${originalPath}/BlockHandler.java
# gawk -i inplace -v varname="${varname}" -v matname="${material_name}" '/walladder/ { print "        registerWall(BlockList."varname"Wall, Blocks."matname");"; print; next}1' ${originalPath}/../recipe/RecipeHandler.java
# gawk -i inplace -v blockname="${block}" -v blocktitle="${title}" '/wordadder/ {print "tile."blockname"_wall.name="blocktitle" Wall"; print; next}1' ../src/main/resources/assets/buildiblocks/lang/en_US.lang

# Generate Slabs
ruby ./generate-json.rb -t slab -n ${block}_slab -o bottom_texture_name=${texture},top_texture_name=${texture},side_texture_name=${texture},parent_model=${parent_block} -v
sed -e s/${originalName}Slab/${name}Slab/g ${originalPath}/slabs/${originalName}Slab.java > ${originalPath}/slabs/${name}Slab.java
sed -i.bak "s/${originalName}/${title}/g" "${originalPath}/slabs/${name}Slab.java"
sed -i.bak s/${originalNameNoCap}_slab/${block}_slab/g ${originalPath}/slabs/${name}Slab.java
rm ${originalPath}/slabs/${name}Slab.java.bak
gawk -i inplace -v varname="${varname}" '/slabadder/ { print "    public static ModBlockSlab "varname"Slab;"; print; next}1' ${originalPath}/BlockList.java
gawk -i inplace -v varname="${varname}" -v blockname="${name}" -v matname="${material_name}" '/slabadder/ { print "        BlockList."varname"Slab = new "blockname"Slab(Blocks."matname").register();"; print; next}1' ${originalPath}/BlockHandler.java
gawk -i inplace -v varname="${varname}" -v matname="${material_name}" '/slabadder/ { print "        registerSlab(BlockList."varname"Slab.getSingleSlab(), Blocks."matname");"; print; next}1' ${originalPath}/../recipe/RecipeHandler.java
gawk -i inplace -v blockname="${block}" -v blocktitle="${title}" '/wordadder/ {print "tile."blockname"_slab.name="blocktitle" Slab"; print; next}1' ../src/main/resources/assets/buildiblocks/lang/en_US.lang