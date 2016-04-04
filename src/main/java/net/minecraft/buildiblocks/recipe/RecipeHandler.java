package net.minecraft.buildiblocks.recipe;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.buildiblocks.block.BlockList;
import net.minecraft.buildiblocks.item.ItemList;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Handles creating the recipes needed by the mod.
 */
public class RecipeHandler {
    public void registerRecipes() {
        removeVanillaRecipes();
        registerPillarRecipes();
        registerBrickRecipes();
        registerWallRecipes();
        registerStairRecipes();
        registerSlabRecipes();
        registerRodRecipes();
        registerFenceRecipes();
        registerTileRecipes();
        reregisterVanillaRecipes();
        registerRandomRecipes();
    }

    private void registerRodRecipes() {
        registerRod(Items.iron_ingot, ItemList.ironRod);
        registerRod(Items.diamond, ItemList.diamondRod);
        registerRod(Items.gold_ingot, ItemList.goldRod);
        registerRod(Items.emerald, ItemList.emeraldRod);
    }

    private void registerRandomRecipes() {
        ItemStack packedIceStack = new ItemStack(Blocks.packed_ice, 2);
        ItemStack iceStack = new ItemStack(Blocks.ice, 1);
        GameRegistry.addRecipe(packedIceStack, "xx", "xx", 'x', iceStack);
    }

    private void registerRod(Item inputItem, Item outputItem) {
        ItemStack inputItemStack = new ItemStack(inputItem, 1);
        ItemStack outputItemStack = new ItemStack(outputItem, 4);
        GameRegistry.addRecipe(outputItemStack, "x", "x", 'x', inputItemStack);
    }

    private void registerTileRecipes() {
        registerTile(BlockList.clayTile, Blocks.hardened_clay);
        registerTile(BlockList.orangeClayTile, Blocks.stained_hardened_clay, EnumDyeColor.ORANGE.getMetadata());
        registerTile(BlockList.magentaClayTile, Blocks.stained_hardened_clay, EnumDyeColor.MAGENTA.getMetadata());
        registerTile(BlockList.lightBlueClayTile, Blocks.stained_hardened_clay, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerTile(BlockList.yellowClayTile, Blocks.stained_hardened_clay, EnumDyeColor.YELLOW.getMetadata());
        registerTile(BlockList.limeClayTile, Blocks.stained_hardened_clay, EnumDyeColor.LIME.getMetadata());
        registerTile(BlockList.pinkClayTile, Blocks.stained_hardened_clay, EnumDyeColor.PINK.getMetadata());
        registerTile(BlockList.grayClayTile, Blocks.stained_hardened_clay, EnumDyeColor.GRAY.getMetadata());
        registerTile(BlockList.silverClayTile, Blocks.stained_hardened_clay, EnumDyeColor.SILVER.getMetadata());
        registerTile(BlockList.cyanClayTile, Blocks.stained_hardened_clay, EnumDyeColor.CYAN.getMetadata());
        registerTile(BlockList.purpleClayTile, Blocks.stained_hardened_clay, EnumDyeColor.PURPLE.getMetadata());
        registerTile(BlockList.blueClayTile, Blocks.stained_hardened_clay, EnumDyeColor.BLUE.getMetadata());
        registerTile(BlockList.brownClayTile, Blocks.stained_hardened_clay, EnumDyeColor.BROWN.getMetadata());
        registerTile(BlockList.greenClayTile, Blocks.stained_hardened_clay, EnumDyeColor.GREEN.getMetadata());
        registerTile(BlockList.redClayTile, Blocks.stained_hardened_clay, EnumDyeColor.RED.getMetadata());
        registerTile(BlockList.blackClayTile, Blocks.stained_hardened_clay, EnumDyeColor.BLACK.getMetadata());
        //tileadder
    }

    private void registerBrickRecipes() {
        registerBrick(BlockList.andesiteBrick, Blocks.stone, BlockStone.EnumType.ANDESITE.getMetadata());
        registerBrick(BlockList.dioriteBrick, Blocks.stone, BlockStone.EnumType.DIORITE.getMetadata());
        registerBrick(BlockList.graniteBrick, Blocks.stone, BlockStone.EnumType.GRANITE.getMetadata());
        //brickadder
    }

    private void registerPillarRecipes() {
        registerPillar(BlockList.stonePillar, Blocks.stone);
        registerPillar(BlockList.carvedBirchWood, Blocks.wooden_slab, BlockPlanks.EnumType.BIRCH.getMetadata(), 1);
        registerPillar(BlockList.carvedBirchLog, Blocks.log, BlockPlanks.EnumType.BIRCH.getMetadata());
        //pillaradder
    }

    private void registerFenceRecipes() {
        registerFence(BlockList.ironFence, Items.iron_ingot, ItemList.ironRod);
        registerFence(BlockList.goldFence, Items.gold_ingot, ItemList.goldRod);
        registerFence(BlockList.diamondFence, Items.diamond, ItemList.diamondRod);
        registerFence(BlockList.emeraldFence, Items.emerald, ItemList.emeraldRod);
        //fenceadder
    }

    private void registerWallRecipes() {
        registerWall(BlockList.netherQuartzWall, Blocks.quartz_block);
        registerWall(BlockList.netherBrickWall, Blocks.nether_brick);
        registerWall(BlockList.stoneWall, Blocks.stone);
        registerWall(BlockList.stoneBrickWall, Blocks.stonebrick);
        registerWall(BlockList.sandstoneWall, Blocks.sandstone);
        registerWall(BlockList.sandstoneBrickWall, Blocks.sandstone, BlockSandStone.EnumType.SMOOTH.getMetadata());
        registerWall(BlockList.brickWall, Blocks.brick_block);
        registerWall(BlockList.lapisLazuliWall, Blocks.lapis_block);
        registerWall(BlockList.polishedAndesiteWall, Blocks.stone, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata());
        registerWall(BlockList.polishedDioriteWall, Blocks.stone, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata());
        registerWall(BlockList.polishedGraniteWall, Blocks.stone, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata());
        registerWall(BlockList.crackedStoneBrickWall, Blocks.stonebrick, BlockStoneBrick.EnumType.CRACKED.getMetadata());
        registerWall(BlockList.mossyStoneBrickWall, Blocks.stonebrick, BlockStoneBrick.EnumType.MOSSY.getMetadata());
        registerWall(BlockList.obsidianWall, Blocks.obsidian);
        registerWall(BlockList.emeraldWall, Blocks.emerald_block);
        registerWall(BlockList.mossyCobblestoneWall, Blocks.mossy_cobblestone);
        registerWall(BlockList.andesiteBrickWall, BlockList.andesiteBrick);
        registerWall(BlockList.dioriteBrickWall, BlockList.dioriteBrick);
        registerWall(BlockList.graniteBrickWall, BlockList.graniteBrick);
        //walladder
    }

    private void registerStairRecipes() {
        registerStairs(BlockList.diamondStairs, Blocks.diamond_block);
        registerStairs(BlockList.ironStairs, Blocks.iron_block);
        registerStairs(BlockList.goldStairs, Blocks.gold_block);
        registerStairs(BlockList.polishedAndesiteStairs, Blocks.stone, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata());
        registerStairs(BlockList.polishedDioriteStairs, Blocks.stone, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata());
        registerStairs(BlockList.polishedGraniteStairs, Blocks.stone, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata());
        registerStairs(BlockList.lapisLazuliStairs, Blocks.lapis_block);
        registerStairs(BlockList.smoothSandstoneStairs, Blocks.sandstone, BlockSandStone.EnumType.SMOOTH.getMetadata());
        registerStairs(BlockList.crackedStoneBrickStairs, Blocks.stonebrick, BlockStoneBrick.EnumType.CRACKED.getMetadata());
        registerStairs(BlockList.mossyStoneBrickStairs, Blocks.stonebrick, BlockStoneBrick.EnumType.MOSSY.getMetadata());
        registerStairs(BlockList.obsidianStairs, Blocks.obsidian);
        registerStairs(BlockList.emeraldStairs, Blocks.emerald_block);
        registerStairs(BlockList.hayStairs, Blocks.hay_block);
        registerStairs(BlockList.hardenedClayStairs, Blocks.hardened_clay);
        registerStairs(BlockList.orangeWoolStairs, Blocks.wool, EnumDyeColor.ORANGE.getMetadata());
        registerStairs(BlockList.whiteWoolStairs, Blocks.wool, EnumDyeColor.WHITE.getMetadata());
        registerStairs(BlockList.magentaWoolStairs, Blocks.wool, EnumDyeColor.MAGENTA.getMetadata());
        registerStairs(BlockList.lightBlueWoolStairs, Blocks.wool, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerStairs(BlockList.yellowWoolStairs, Blocks.wool, EnumDyeColor.YELLOW.getMetadata());
        registerStairs(BlockList.limeWoolStairs, Blocks.wool, EnumDyeColor.LIME.getMetadata());
        registerStairs(BlockList.pinkWoolStairs, Blocks.wool, EnumDyeColor.PINK.getMetadata());
        registerStairs(BlockList.grayWoolStairs, Blocks.wool, EnumDyeColor.GRAY.getMetadata());
        registerStairs(BlockList.silverWoolStairs, Blocks.wool, EnumDyeColor.SILVER.getMetadata());
        registerStairs(BlockList.cyanWoolStairs, Blocks.wool, EnumDyeColor.CYAN.getMetadata());
        registerStairs(BlockList.purpleWoolStairs, Blocks.wool, EnumDyeColor.PURPLE.getMetadata());
        registerStairs(BlockList.blueWoolStairs, Blocks.wool, EnumDyeColor.BLUE.getMetadata());
        registerStairs(BlockList.brownWoolStairs, Blocks.wool, EnumDyeColor.BROWN.getMetadata());
        registerStairs(BlockList.greenWoolStairs, Blocks.wool, EnumDyeColor.GREEN.getMetadata());
        registerStairs(BlockList.redWoolStairs, Blocks.wool, EnumDyeColor.RED.getMetadata());
        registerStairs(BlockList.blackWoolStairs, Blocks.wool, EnumDyeColor.BLACK.getMetadata());
        registerStairs(BlockList.whiteHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.WHITE.getMetadata());
        registerStairs(BlockList.orangeHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.ORANGE.getMetadata());
        registerStairs(BlockList.magentaHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.MAGENTA.getMetadata());
        registerStairs(BlockList.light_blueHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerStairs(BlockList.yellowHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.YELLOW.getMetadata());
        registerStairs(BlockList.limeHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.LIME.getMetadata());
        registerStairs(BlockList.pinkHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.PINK.getMetadata());
        registerStairs(BlockList.grayHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.GRAY.getMetadata());
        registerStairs(BlockList.silverHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.SILVER.getMetadata());
        registerStairs(BlockList.cyanHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.CYAN.getMetadata());
        registerStairs(BlockList.purpleHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.PURPLE.getMetadata());
        registerStairs(BlockList.blueHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.BLUE.getMetadata());
        registerStairs(BlockList.brownHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.BROWN.getMetadata());
        registerStairs(BlockList.greenHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.GREEN.getMetadata());
        registerStairs(BlockList.redHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.RED.getMetadata());
        registerStairs(BlockList.blackHardenedClayStairs, Blocks.stained_hardened_clay, EnumDyeColor.BLACK.getMetadata());
        registerStairs(BlockList.mossyCobblestoneStairs, Blocks.mossy_cobblestone);
        registerStairs(BlockList.prismarineBrickStairs, Blocks.prismarine, BlockPrismarine.BRICKS_META);
        registerStairs(BlockList.darkPrismarineStairs, Blocks.prismarine, BlockPrismarine.DARK_META);
        registerStairs(BlockList.clayTileStairs, BlockList.clayTile);
        registerStairs(BlockList.orangeClayTileStairs, BlockList.orangeClayTile);
        registerStairs(BlockList.orangeClayTileStairs, BlockList.orangeClayTile);
        registerStairs(BlockList.magentaClayTileStairs, BlockList.magentaClayTile);
        registerStairs(BlockList.lightBlueClayTileStairs, BlockList.lightBlueClayTile);
        registerStairs(BlockList.yellowClayTileStairs, BlockList.yellowClayTile);
        registerStairs(BlockList.limeClayTileStairs, BlockList.limeClayTile);
        registerStairs(BlockList.pinkClayTileStairs, BlockList.pinkClayTile);
        registerStairs(BlockList.grayClayTileStairs, BlockList.grayClayTile);
        registerStairs(BlockList.silverClayTileStairs, BlockList.silverClayTile);
        registerStairs(BlockList.cyanClayTileStairs, BlockList.cyanClayTile);
        registerStairs(BlockList.purpleClayTileStairs, BlockList.purpleClayTile);
        registerStairs(BlockList.blueClayTileStairs, BlockList.blueClayTile);
        registerStairs(BlockList.brownClayTileStairs, BlockList.brownClayTile);
        registerStairs(BlockList.greenClayTileStairs, BlockList.greenClayTile);
        registerStairs(BlockList.redClayTileStairs, BlockList.redClayTile);
        registerStairs(BlockList.blackClayTileStairs, BlockList.blackClayTile);
        registerStairs(BlockList.andesiteBrickStairs, BlockList.andesiteBrick);
        registerStairs(BlockList.dioriteBrickStairs, BlockList.dioriteBrick);
        registerStairs(BlockList.graniteBrickStairs, BlockList.graniteBrick);
        //stairsadder
    }

    private void registerSlabRecipes() {
        registerSlab(BlockList.diamondSlab.getSingleSlab(), Blocks.diamond_block);
        registerSlab(BlockList.ironSlab.getSingleSlab(), Blocks.iron_block);
        registerSlab(BlockList.goldSlab.getSingleSlab(), Blocks.gold_block);
        registerSlab(BlockList.polishedAndesiteSlab.getSingleSlab(), 0, Blocks.stone, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata());
        registerSlab(BlockList.polishedDioriteSlab.getSingleSlab(), 0, Blocks.stone, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata());
        registerSlab(BlockList.polishedGraniteSlab.getSingleSlab(), 0, Blocks.stone, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata());
        registerSlab(BlockList.lapisLazuliSlab.getSingleSlab(), Blocks.lapis_block);
        registerSlab(BlockList.smoothSandstoneSlab.getSingleSlab(), 0, Blocks.sandstone, BlockSandStone.EnumType.SMOOTH.getMetadata());
        registerSlab(BlockList.crackedStoneBrickSlab.getSingleSlab(), 0, Blocks.stonebrick, BlockStoneBrick.EnumType.CRACKED.getMetadata());
        registerSlab(BlockList.mossyStoneBrickSlab.getSingleSlab(), 0, Blocks.stonebrick, BlockStoneBrick.EnumType.MOSSY.getMetadata());
        registerSlab(BlockList.obsidianSlab.getSingleSlab(), Blocks.obsidian);
        registerSlab(BlockList.emeraldSlab.getSingleSlab(), Blocks.emerald_block);
        registerSlab(BlockList.haySlab.getSingleSlab(), Blocks.hay_block);
        registerSlab(BlockList.orangeWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.ORANGE.getMetadata());
        registerSlab(BlockList.whiteWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.WHITE.getMetadata());
        registerSlab(BlockList.magentaWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.MAGENTA.getMetadata());
        registerSlab(BlockList.lightBlueWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerSlab(BlockList.yellowWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.YELLOW.getMetadata());
        registerSlab(BlockList.limeWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.LIME.getMetadata());
        registerSlab(BlockList.pinkWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.PINK.getMetadata());
        registerSlab(BlockList.grayWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.GRAY.getMetadata());
        registerSlab(BlockList.silverWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.SILVER.getMetadata());
        registerSlab(BlockList.cyanWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.CYAN.getMetadata());
        registerSlab(BlockList.purpleWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.PURPLE.getMetadata());
        registerSlab(BlockList.blueWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.BLUE.getMetadata());
        registerSlab(BlockList.brownWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.BROWN.getMetadata());
        registerSlab(BlockList.greenWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.GREEN.getMetadata());
        registerSlab(BlockList.redWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.RED.getMetadata());
        registerSlab(BlockList.blackWoolSlab.getSingleSlab(), 0, Blocks.wool, EnumDyeColor.BLACK.getMetadata());
        registerSlab(BlockList.whiteHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.WHITE.getMetadata());
        registerSlab(BlockList.orangeHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.ORANGE.getMetadata());
        registerSlab(BlockList.magentaHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.MAGENTA.getMetadata());
        registerSlab(BlockList.light_blueHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerSlab(BlockList.yellowHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.YELLOW.getMetadata());
        registerSlab(BlockList.limeHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.LIME.getMetadata());
        registerSlab(BlockList.pinkHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.PINK.getMetadata());
        registerSlab(BlockList.grayHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.GRAY.getMetadata());
        registerSlab(BlockList.silverHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.SILVER.getMetadata());
        registerSlab(BlockList.cyanHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.CYAN.getMetadata());
        registerSlab(BlockList.purpleHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.PURPLE.getMetadata());
        registerSlab(BlockList.blueHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.BLUE.getMetadata());
        registerSlab(BlockList.brownHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.BROWN.getMetadata());
        registerSlab(BlockList.greenHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.GREEN.getMetadata());
        registerSlab(BlockList.redHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.RED.getMetadata());
        registerSlab(BlockList.blackHardenedClaySlab.getSingleSlab(), 0, Blocks.stained_hardened_clay, EnumDyeColor.BLACK.getMetadata());
        registerSlab(BlockList.mossyCobblestoneSlab.getSingleSlab(), Blocks.mossy_cobblestone);
        registerSlab(BlockList.prismarineBrickSlab.getSingleSlab(), 0, Blocks.prismarine, BlockPrismarine.BRICKS_META);
        registerSlab(BlockList.darkPrismarineSlab.getSingleSlab(), 0, Blocks.prismarine, BlockPrismarine.DARK_META);
        registerSlab(BlockList.hardenedClaySlab.getSingleSlab(), Blocks.hardened_clay);
        registerSlab(BlockList.clayTileSlab.getSingleSlab(), BlockList.clayTile);
        registerSlab(BlockList.orangeClayTileSlab.getSingleSlab(), BlockList.orangeClayTile);
        registerSlab(BlockList.magentaClayTileSlab.getSingleSlab(), BlockList.magentaClayTile);
        registerSlab(BlockList.lightBlueClayTileSlab.getSingleSlab(), BlockList.lightBlueClayTile);
        registerSlab(BlockList.yellowClayTileSlab.getSingleSlab(), BlockList.yellowClayTile);
        registerSlab(BlockList.limeClayTileSlab.getSingleSlab(), BlockList.limeClayTile);
        registerSlab(BlockList.pinkClayTileSlab.getSingleSlab(), BlockList.pinkClayTile);
        registerSlab(BlockList.grayClayTileSlab.getSingleSlab(), BlockList.grayClayTile);
        registerSlab(BlockList.silverClayTileSlab.getSingleSlab(), BlockList.silverClayTile);
        registerSlab(BlockList.cyanClayTileSlab.getSingleSlab(), BlockList.cyanClayTile);
        registerSlab(BlockList.purpleClayTileSlab.getSingleSlab(), BlockList.purpleClayTile);
        registerSlab(BlockList.blueClayTileSlab.getSingleSlab(), BlockList.blueClayTile);
        registerSlab(BlockList.brownClayTileSlab.getSingleSlab(), BlockList.brownClayTile);
        registerSlab(BlockList.greenClayTileSlab.getSingleSlab(), BlockList.greenClayTile);
        registerSlab(BlockList.redClayTileSlab.getSingleSlab(), BlockList.redClayTile);
        registerSlab(BlockList.blackClayTileSlab.getSingleSlab(), BlockList.blackClayTile);
        registerSlab(BlockList.andesiteBrickSlab.getSingleSlab(), BlockList.andesiteBrick);
        registerSlab(BlockList.dioriteBrickSlab.getSingleSlab(), BlockList.dioriteBrick);
        registerSlab(BlockList.graniteBrickSlab.getSingleSlab(), BlockList.graniteBrick);
        //slabadder
    }

    private void removeVanillaRecipes() {
        removeBlockRecipe(Blocks.stone_slab);

        // Remove polished andesite/diorite/granite recipes
        removeBlockRecipe(Blocks.stone, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata());
        removeBlockRecipe(Blocks.stone, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata());
        removeBlockRecipe(Blocks.stone, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata());

        // Remove Stair recipes
        removeBlockRecipe(Blocks.sandstone_stairs);
        removeBlockRecipe(Blocks.stone_stairs);
        removeBlockRecipe(Blocks.spruce_stairs);
        removeBlockRecipe(Blocks.acacia_stairs);
        removeBlockRecipe(Blocks.birch_stairs);
        removeBlockRecipe(Blocks.dark_oak_stairs);
        removeBlockRecipe(Blocks.jungle_stairs);
        removeBlockRecipe(Blocks.oak_stairs);
        removeBlockRecipe(Blocks.quartz_stairs);
        removeBlockRecipe(Blocks.red_sandstone_stairs);
        removeBlockRecipe(Blocks.nether_brick_stairs);
        removeBlockRecipe(Blocks.brick_stairs);
        removeBlockRecipe(Blocks.stone_brick_stairs);
    }

    private void reregisterVanillaRecipes() {
        // Re-register polished andesite/diorite/granite
        registerBlock(Blocks.stone, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata(),
                Blocks.stone, BlockStone.EnumType.ANDESITE.getMetadata());
        registerBlock(Blocks.stone, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata(),
                Blocks.stone, BlockStone.EnumType.DIORITE.getMetadata());
        registerBlock(Blocks.stone, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata(),
                Blocks.stone, BlockStone.EnumType.GRANITE.getMetadata());

        // Re-register default stairs.
        registerStairs(Blocks.stone_stairs, Blocks.cobblestone);
        registerStairs(Blocks.spruce_stairs, Blocks.planks, BlockPlanks.EnumType.SPRUCE.getMetadata());
        registerStairs(Blocks.acacia_stairs, Blocks.planks, BlockPlanks.EnumType.ACACIA.getMetadata());
        registerStairs(Blocks.birch_stairs, Blocks.planks, BlockPlanks.EnumType.BIRCH.getMetadata());
        registerStairs(Blocks.dark_oak_stairs, Blocks.planks, BlockPlanks.EnumType.DARK_OAK.getMetadata());
        registerStairs(Blocks.jungle_stairs, Blocks.planks, BlockPlanks.EnumType.JUNGLE.getMetadata());
        registerStairs(Blocks.oak_stairs, Blocks.planks, BlockPlanks.EnumType.OAK.getMetadata());
        registerStairs(Blocks.quartz_stairs, Blocks.quartz_block);
        registerStairs(Blocks.red_sandstone_stairs, Blocks.red_sandstone);
        registerStairs(Blocks.nether_brick_stairs, Blocks.nether_brick);
        registerStairs(Blocks.sandstone_stairs, Blocks.sandstone, BlockSandStone.EnumType.DEFAULT.getMetadata());
        registerStairs(Blocks.stone_brick_stairs, Blocks.stonebrick, BlockStoneBrick.EnumType.DEFAULT.getMetadata());

        // Re-register normal slabs.
        registerSlab(Blocks.stone_slab, BlockStoneSlab.EnumType.COBBLESTONE.getMetadata(), Blocks.cobblestone, 0);
        registerSlab(Blocks.stone_slab, BlockStoneSlab.EnumType.QUARTZ.getMetadata(), Blocks.quartz_block, 0);
        registerSlab(Blocks.stone_slab, BlockStoneSlab.EnumType.BRICK.getMetadata(), Blocks.brick_block, 0);
        registerSlab(Blocks.stone_slab, BlockStoneSlab.EnumType.SAND.getMetadata(), Blocks.sandstone, 0);
        registerSlab(Blocks.stone_slab, BlockStoneSlab.EnumType.STONE.getMetadata(), Blocks.stone, 0);
        registerSlab(Blocks.stone_slab, BlockStoneSlab.EnumType.SMOOTHBRICK.getMetadata(), Blocks.stonebrick, 0);
        registerSlab(Blocks.stone_slab, BlockStoneSlab.EnumType.NETHERBRICK.getMetadata(), Blocks.nether_brick, 0);
    }

    private void removeBlockRecipe(Block block) {
        this.removeBlockRecipe(block, 0);
    }

    private void removeBlockRecipe(Block block, int meta) {
        Item item = new ItemStack(block, 1, meta).getItem();
        this.removeRecipe(item);
    }

    private void removeRecipe(Item item) {
        List recipeList = CraftingManager.getInstance().getRecipeList();

        Iterator remover = recipeList.iterator();
        while(remover.hasNext()) {
            Object recipeObject = remover.next();
            if(recipeObject instanceof IRecipe) {
                IRecipe recipe = (IRecipe) recipeObject;
                ItemStack itemStack = recipe.getRecipeOutput();
                if(itemStack != null && itemStack.getItem() == item) {
                    remover.remove();
                }
            }
        }
    }

    private void registerBlock(Block outputBlock, Block inputBlock) {
        this.registerBlock(outputBlock, 0, inputBlock, 0);
    }

    private void registerBlock(Block outputBlock, int outputMeta, Block inputBlock, int inputMeta) {
        ItemStack outputStack = new ItemStack(outputBlock, 1, outputMeta);
        ItemStack inputStack = new ItemStack(inputBlock, 1, inputMeta);
        GameRegistry.addRecipe(outputStack, "x", 'x', inputStack);
    }

    private void registerFence(Block fenceBlock, Item plankItem, Item stickItem) {
        ItemStack plankBlockStack = new ItemStack(plankItem, 1, 0);
        ItemStack stickItemStack = new ItemStack(stickItem, 1, 0);
        ItemStack fenceStack = new ItemStack(fenceBlock, 3, 0);
        GameRegistry.addRecipe(fenceStack, "xyx", "xyx", 'x', plankBlockStack, 'y', stickItemStack);
    }

    private void registerPillar(Block pillarBlock, Block sourceBlock) {
        this.registerPillar(pillarBlock, sourceBlock, 0);
    }

    private void registerPillar(Block pillarBlock, Block sourceBlock, int meta) {
        this.registerPillar(pillarBlock, sourceBlock, meta, 2);
    }

    private void registerPillar(Block pillarBlock, Block sourceBlock, int meta, int numReturn) {
        ItemStack sourceItemStack = new ItemStack(sourceBlock, 1, meta);
        ItemStack pillarStack = new ItemStack(pillarBlock, numReturn);
        GameRegistry.addRecipe(pillarStack, "x", "x", 'x', sourceItemStack);
    }

    private void registerBrick(Block brickBlock, Block sourceBlock) {
        this.registerBrick(brickBlock, sourceBlock, 0);
    }

    private void registerBrick(Block brickBlock, Block sourceBlock, int meta) {
        ItemStack sourceItemStack = new ItemStack(sourceBlock, 1, meta);
        ItemStack brickStack = new ItemStack(brickBlock, 4);
        GameRegistry.addRecipe(brickStack, "xx", "xx", 'x', sourceItemStack);
    }

    private void registerStairs(Block stairBlock, Block sourceBlock) {
        this.registerStairs(stairBlock, sourceBlock, 0);
    }

    private void registerStairs(Block stairBlock, Block sourceBlock, int meta) {
        ItemStack sourceItemStack = new ItemStack(sourceBlock, 1, meta);
        ItemStack stairStack = new ItemStack(stairBlock, 6);
        GameRegistry.addRecipe(stairStack, "  x", " xx", "xxx", 'x', sourceItemStack);
    }

    private void registerSlab(Block slabBlock, Block sourceBlock) {
        this.registerSlab(slabBlock, 0, sourceBlock, 0);
    }

    private void registerSlab(Block slabBlock, int slabMeta, Block sourceBlock, int blockMeta) {
        ItemStack sourceItemStack = new ItemStack(sourceBlock, 1, blockMeta);
        ItemStack slabStack = new ItemStack(slabBlock, 6, slabMeta);
        registerSlab(sourceItemStack, slabStack);
    }

    private void registerSlab(ItemStack sourceItemStack, ItemStack slabStack) {
        GameRegistry.addRecipe(slabStack, "xxx", 'x', sourceItemStack);
    }

    private void registerWall(Block wallBlock, Block sourceBlock) {
        this.registerWall(wallBlock, sourceBlock, 0);
    }

    private void registerWall(Block wallBlock, Block sourceBlock, int meta) {
        ItemStack sourceItemStack = new ItemStack(sourceBlock, 1, meta);
        ItemStack wallStack = new ItemStack(wallBlock, 6);
        GameRegistry.addRecipe(wallStack, "xxx", "xxx", 'x', sourceItemStack);
    }

    private void registerTile(Block tileBlock, Block sourceBlock) {
        this.registerTile(tileBlock, sourceBlock, 0);
    }

    private void registerTile(Block tileBlock, Block sourceBlock, int meta) {
        ItemStack sourceItemStack = new ItemStack(sourceBlock, 1, meta);
        ItemStack tileStack = new ItemStack(tileBlock, 4);
        GameRegistry.addRecipe(tileStack, "xx", "xx", 'x', sourceItemStack);
    }
}
