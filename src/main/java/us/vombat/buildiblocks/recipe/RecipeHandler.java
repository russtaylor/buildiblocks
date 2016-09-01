package us.vombat.buildiblocks.recipe;

import net.minecraft.block.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.vombat.buildiblocks.block.BlockList;
import us.vombat.buildiblocks.item.ItemList;

import java.util.Iterator;
import java.util.List;

/**
 * Handles creating the recipes needed by the mod.
 */
public class RecipeHandler {
    public void registerRecipes() {
        removeVanillaRecipes();
        registerSmeltingRecipes();
        registerPillarRecipes();
        registerBrickRecipes();
        registerTorchRecipes();
        registerChiseledRecipes();
        registerWallRecipes();
        registerStairRecipes();
        registerSlabRecipes();
        registerRodRecipes();
        registerFenceRecipes();
        registerTileRecipes();
        registerLatticeRecipes();
        reregisterVanillaRecipes();
        registerRandomRecipes();
    }

    private void registerRodRecipes() {
        registerRod(Items.IRON_INGOT, ItemList.ironRod);
        registerRod(Items.DIAMOND, ItemList.diamondRod);
        registerRod(Items.GOLD_INGOT, ItemList.goldRod);
        registerRod(Items.EMERALD, ItemList.emeraldRod);
    }

    private void registerSmeltingRecipes() {
        registerSmelt(Blocks.DIRT, Blocks.HARDENED_CLAY);
    }

    private void registerSmelt(Block inputBlock, Block outputBlock) {
        this.registerSmelt(inputBlock, outputBlock, 0.05F);
    }

    private void registerSmelt(Block inputBlock, Block outputBlock, float xp) {
        ItemStack inputStack = new ItemStack(inputBlock, 1);
        ItemStack outputStack = new ItemStack(outputBlock, 1);
        GameRegistry.addSmelting(inputStack, outputStack, xp);
    }

    private void registerSmelt(Item inputItem, Item outputItem) {
        this.registerSmelt(inputItem, outputItem, 0.1F);
    }

    private void registerSmelt(Item inputItem, Item outputItem, float xp) {
        ItemStack inputStack = new ItemStack(inputItem, 1);
        ItemStack outputStack = new ItemStack(outputItem, 1);
        GameRegistry.addSmelting(inputStack, outputStack, xp);
    }

    private void registerTorchRecipes() {
        registerTorch(BlockList.ironTorch, ItemList.ironRod);
        registerTorch(BlockList.goldTorch, ItemList.goldRod);
    }

    private void registerRandomRecipes() {
        ItemStack packedIceStack = new ItemStack(Blocks.PACKED_ICE, 2);
        ItemStack iceStack = new ItemStack(Blocks.ICE, 1);
        GameRegistry.addRecipe(packedIceStack, "xx", "xx", 'x', iceStack);

        ItemStack paperWallStack = new ItemStack(BlockList.paperWall, 2);
        ItemStack paperStack = new ItemStack(Items.PAPER, 1);
        GameRegistry.addRecipe(paperWallStack, "xx", "xx", 'x', paperStack);
    }

    private void registerRod(Item inputItem, Item outputItem) {
        ItemStack inputItemStack = new ItemStack(inputItem, 1);
        ItemStack outputItemStack = new ItemStack(outputItem, 4);
        GameRegistry.addRecipe(outputItemStack, "x", "x", 'x', inputItemStack);
    }

    private void registerChiseledRecipes() {
        registerChiseled(BlockList.chiseledGraniteBrick, BlockList.graniteBrickSlab.getSingleSlab());
        registerChiseled(BlockList.chiseledDioriteBrick, BlockList.dioriteBrickSlab.getSingleSlab());
        registerChiseled(BlockList.chiseledAndesiteBrick, BlockList.andesiteBrickSlab.getSingleSlab());
        //chiseledadder
    }

    private void registerTileRecipes() {
        registerTile(BlockList.clayTile, Blocks.HARDENED_CLAY);
        registerTile(BlockList.orangeClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.ORANGE.getMetadata());
        registerTile(BlockList.magentaClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.MAGENTA.getMetadata());
        registerTile(BlockList.lightBlueClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerTile(BlockList.yellowClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.YELLOW.getMetadata());
        registerTile(BlockList.limeClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.LIME.getMetadata());
        registerTile(BlockList.pinkClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.PINK.getMetadata());
        registerTile(BlockList.grayClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.GRAY.getMetadata());
        registerTile(BlockList.silverClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.SILVER.getMetadata());
        registerTile(BlockList.cyanClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.CYAN.getMetadata());
        registerTile(BlockList.purpleClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.PURPLE.getMetadata());
        registerTile(BlockList.blueClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.BLUE.getMetadata());
        registerTile(BlockList.brownClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.BROWN.getMetadata());
        registerTile(BlockList.greenClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.GREEN.getMetadata());
        registerTile(BlockList.redClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.RED.getMetadata());
        registerTile(BlockList.blackClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.BLACK.getMetadata());
        registerTile(BlockList.whiteClayTile, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.WHITE.getMetadata());
        //tileadder
    }

    private void registerBrickRecipes() {
        registerBrick(BlockList.andesiteBrick, Blocks.STONE, BlockStone.EnumType.ANDESITE.getMetadata());
        registerBrick(BlockList.dioriteBrick, Blocks.STONE, BlockStone.EnumType.DIORITE.getMetadata());
        registerBrick(BlockList.graniteBrick, Blocks.STONE, BlockStone.EnumType.GRANITE.getMetadata());
        //brickadder
    }

    private void registerPillarRecipes() {
        registerPillar(BlockList.stonePillar, Blocks.STONE);
        registerPillar(BlockList.andesitePillar, BlockList.andesiteBrick);
        registerPillar(BlockList.dioritePillar, BlockList.dioriteBrick);
        registerPillar(BlockList.granitePillar, BlockList.graniteBrick);
        registerPillar(BlockList.carvedBirchWood, Blocks.WOODEN_SLAB, BlockPlanks.EnumType.BIRCH.getMetadata(), 1);
        registerPillar(BlockList.carvedBirchLog, Blocks.LOG, BlockPlanks.EnumType.BIRCH.getMetadata());
        registerPillar(BlockList.carvedOakWood, Blocks.WOODEN_SLAB, BlockPlanks.EnumType.OAK.getMetadata(), 1);
        registerPillar(BlockList.carvedOakLog, Blocks.LOG, BlockPlanks.EnumType.OAK.getMetadata());
        registerPillar(BlockList.carvedDarkOakWood, Blocks.WOODEN_SLAB, BlockPlanks.EnumType.DARK_OAK.getMetadata(), 1);
        registerPillar(BlockList.carvedDarkOakLog, Blocks.LOG2, BlockPlanks.EnumType.DARK_OAK.getMetadata() - 4); // DIE, MOJANG!
        registerPillar(BlockList.carvedJungleWood, Blocks.WOODEN_SLAB, BlockPlanks.EnumType.JUNGLE.getMetadata(), 1);
        registerPillar(BlockList.carvedJungleLog, Blocks.LOG, BlockPlanks.EnumType.JUNGLE.getMetadata());
        registerPillar(BlockList.carvedAcaciaWood, Blocks.WOODEN_SLAB, BlockPlanks.EnumType.ACACIA.getMetadata(), 1);
        registerPillar(BlockList.carvedAcaciaLog, Blocks.LOG2, BlockPlanks.EnumType.ACACIA.getMetadata() - 4); // DIE, MOJANG!
        registerPillar(BlockList.carvedSpruceWood, Blocks.WOODEN_SLAB, BlockPlanks.EnumType.SPRUCE.getMetadata(), 1);
        registerPillar(BlockList.carvedSpruceLog, Blocks.LOG, BlockPlanks.EnumType.SPRUCE.getMetadata());
        //pillaradder
    }

    private void registerFenceRecipes() {
        registerFence(BlockList.ironFence, Items.IRON_INGOT, ItemList.ironRod);
        registerFence(BlockList.goldFence, Items.GOLD_INGOT, ItemList.goldRod);
        registerFence(BlockList.diamondFence, Items.DIAMOND, ItemList.diamondRod);
        registerFence(BlockList.emeraldFence, Items.EMERALD, ItemList.emeraldRod);
        //fenceadder
    }

    private void registerWallRecipes() {
        registerWall(BlockList.netherQuartzWall, Blocks.QUARTZ_BLOCK);
        registerWall(BlockList.netherBrickWall, Blocks.NETHER_BRICK);
        registerWall(BlockList.stoneWall, Blocks.STONE);
        registerWall(BlockList.stoneBrickWall, Blocks.STONEBRICK);
        registerWall(BlockList.sandstoneWall, Blocks.SANDSTONE);
        registerWall(BlockList.sandstoneBrickWall, Blocks.SANDSTONE, BlockSandStone.EnumType.SMOOTH.getMetadata());
        registerWall(BlockList.brickWall, Blocks.BRICK_BLOCK);
        registerWall(BlockList.lapisLazuliWall, Blocks.LAPIS_BLOCK);
        registerWall(BlockList.polishedAndesiteWall, Blocks.STONE, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata());
        registerWall(BlockList.polishedDioriteWall, Blocks.STONE, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata());
        registerWall(BlockList.polishedGraniteWall, Blocks.STONE, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata());
        registerWall(BlockList.crackedStoneBrickWall, Blocks.STONEBRICK, BlockStoneBrick.EnumType.CRACKED.getMetadata());
        registerWall(BlockList.mossyStoneBrickWall, Blocks.STONEBRICK, BlockStoneBrick.EnumType.MOSSY.getMetadata());
        registerWall(BlockList.obsidianWall, Blocks.OBSIDIAN);
        registerWall(BlockList.emeraldWall, Blocks.EMERALD_BLOCK);
        registerWall(BlockList.mossyCobblestoneWall, Blocks.MOSSY_COBBLESTONE);
        registerWall(BlockList.andesiteBrickWall, BlockList.andesiteBrick);
        registerWall(BlockList.dioriteBrickWall, BlockList.dioriteBrick);
        registerWall(BlockList.graniteBrickWall, BlockList.graniteBrick);
        //walladder
    }

    private void registerStairRecipes() {
        registerStairs(BlockList.diamondStairs, Blocks.DIAMOND_BLOCK);
        registerStairs(BlockList.ironStairs, Blocks.IRON_BLOCK);
        registerStairs(BlockList.goldStairs, Blocks.GOLD_BLOCK);
        registerStairs(BlockList.polishedAndesiteStairs, Blocks.STONE, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata());
        registerStairs(BlockList.polishedDioriteStairs, Blocks.STONE, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata());
        registerStairs(BlockList.polishedGraniteStairs, Blocks.STONE, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata());
        registerStairs(BlockList.lapisLazuliStairs, Blocks.LAPIS_BLOCK);
        registerStairs(BlockList.smoothSandstoneStairs, Blocks.SANDSTONE, BlockSandStone.EnumType.SMOOTH.getMetadata());
        registerStairs(BlockList.crackedStoneBrickStairs, Blocks.STONEBRICK, BlockStoneBrick.EnumType.CRACKED.getMetadata());
        registerStairs(BlockList.mossyStoneBrickStairs, Blocks.STONEBRICK, BlockStoneBrick.EnumType.MOSSY.getMetadata());
        registerStairs(BlockList.obsidianStairs, Blocks.OBSIDIAN);
        registerStairs(BlockList.emeraldStairs, Blocks.EMERALD_BLOCK);
        registerStairs(BlockList.hayStairs, Blocks.HAY_BLOCK);
        registerStairs(BlockList.hardenedClayStairs, Blocks.HARDENED_CLAY);
        registerStairs(BlockList.orangeWoolStairs, Blocks.WOOL, EnumDyeColor.ORANGE.getMetadata());
        registerStairs(BlockList.whiteWoolStairs, Blocks.WOOL, EnumDyeColor.WHITE.getMetadata());
        registerStairs(BlockList.magentaWoolStairs, Blocks.WOOL, EnumDyeColor.MAGENTA.getMetadata());
        registerStairs(BlockList.lightBlueWoolStairs, Blocks.WOOL, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerStairs(BlockList.yellowWoolStairs, Blocks.WOOL, EnumDyeColor.YELLOW.getMetadata());
        registerStairs(BlockList.limeWoolStairs, Blocks.WOOL, EnumDyeColor.LIME.getMetadata());
        registerStairs(BlockList.pinkWoolStairs, Blocks.WOOL, EnumDyeColor.PINK.getMetadata());
        registerStairs(BlockList.grayWoolStairs, Blocks.WOOL, EnumDyeColor.GRAY.getMetadata());
        registerStairs(BlockList.silverWoolStairs, Blocks.WOOL, EnumDyeColor.SILVER.getMetadata());
        registerStairs(BlockList.cyanWoolStairs, Blocks.WOOL, EnumDyeColor.CYAN.getMetadata());
        registerStairs(BlockList.purpleWoolStairs, Blocks.WOOL, EnumDyeColor.PURPLE.getMetadata());
        registerStairs(BlockList.blueWoolStairs, Blocks.WOOL, EnumDyeColor.BLUE.getMetadata());
        registerStairs(BlockList.brownWoolStairs, Blocks.WOOL, EnumDyeColor.BROWN.getMetadata());
        registerStairs(BlockList.greenWoolStairs, Blocks.WOOL, EnumDyeColor.GREEN.getMetadata());
        registerStairs(BlockList.redWoolStairs, Blocks.WOOL, EnumDyeColor.RED.getMetadata());
        registerStairs(BlockList.blackWoolStairs, Blocks.WOOL, EnumDyeColor.BLACK.getMetadata());
        registerStairs(BlockList.whiteHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.WHITE.getMetadata());
        registerStairs(BlockList.orangeHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.ORANGE.getMetadata());
        registerStairs(BlockList.magentaHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.MAGENTA.getMetadata());
        registerStairs(BlockList.light_blueHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerStairs(BlockList.yellowHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.YELLOW.getMetadata());
        registerStairs(BlockList.limeHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.LIME.getMetadata());
        registerStairs(BlockList.pinkHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.PINK.getMetadata());
        registerStairs(BlockList.grayHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.GRAY.getMetadata());
        registerStairs(BlockList.silverHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.SILVER.getMetadata());
        registerStairs(BlockList.cyanHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.CYAN.getMetadata());
        registerStairs(BlockList.purpleHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.PURPLE.getMetadata());
        registerStairs(BlockList.blueHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.BLUE.getMetadata());
        registerStairs(BlockList.brownHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.BROWN.getMetadata());
        registerStairs(BlockList.greenHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.GREEN.getMetadata());
        registerStairs(BlockList.redHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.RED.getMetadata());
        registerStairs(BlockList.blackHardenedClayStairs, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.BLACK.getMetadata());
        registerStairs(BlockList.mossyCobblestoneStairs, Blocks.MOSSY_COBBLESTONE);
        registerStairs(BlockList.prismarineBrickStairs, Blocks.PRISMARINE, BlockPrismarine.BRICKS_META);
        registerStairs(BlockList.darkPrismarineStairs, Blocks.PRISMARINE, BlockPrismarine.DARK_META);
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
        registerStairs(BlockList.whiteClayTileStairs, BlockList.whiteClayTile);
        registerStairs(BlockList.whiteGlassStairs, Blocks.GLASS, EnumDyeColor.WHITE.getMetadata());
        registerStairs(BlockList.whiteGlassStairs, Blocks.GLASS, EnumDyeColor.WHITE.getMetadata());
        registerStairs(BlockList.whiteGlassStairs, Blocks.GLASS, EnumDyeColor.WHITE.getMetadata());
        //stairsadder
    }

    private void registerSlabRecipes() {
        registerSlab(BlockList.diamondSlab.getSingleSlab(), Blocks.DIAMOND_BLOCK);
        registerSlab(BlockList.ironSlab.getSingleSlab(), Blocks.IRON_BLOCK);
        registerSlab(BlockList.goldSlab.getSingleSlab(), Blocks.GOLD_BLOCK);
        registerSlab(BlockList.polishedAndesiteSlab.getSingleSlab(), 0, Blocks.STONE, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata());
        registerSlab(BlockList.polishedDioriteSlab.getSingleSlab(), 0, Blocks.STONE, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata());
        registerSlab(BlockList.polishedGraniteSlab.getSingleSlab(), 0, Blocks.STONE, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata());
        registerSlab(BlockList.lapisLazuliSlab.getSingleSlab(), Blocks.LAPIS_BLOCK);
        registerSlab(BlockList.smoothSandstoneSlab.getSingleSlab(), 0, Blocks.SANDSTONE, BlockSandStone.EnumType.SMOOTH.getMetadata());
        registerSlab(BlockList.crackedStoneBrickSlab.getSingleSlab(), 0, Blocks.STONEBRICK, BlockStoneBrick.EnumType.CRACKED.getMetadata());
        registerSlab(BlockList.mossyStoneBrickSlab.getSingleSlab(), 0, Blocks.STONEBRICK, BlockStoneBrick.EnumType.MOSSY.getMetadata());
        registerSlab(BlockList.obsidianSlab.getSingleSlab(), Blocks.OBSIDIAN);
        registerSlab(BlockList.emeraldSlab.getSingleSlab(), Blocks.EMERALD_BLOCK);
        registerSlab(BlockList.haySlab.getSingleSlab(), Blocks.HAY_BLOCK);
        registerSlab(BlockList.orangeWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.ORANGE.getMetadata());
        registerSlab(BlockList.whiteWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.WHITE.getMetadata());
        registerSlab(BlockList.magentaWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.MAGENTA.getMetadata());
        registerSlab(BlockList.lightBlueWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerSlab(BlockList.yellowWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.YELLOW.getMetadata());
        registerSlab(BlockList.limeWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.LIME.getMetadata());
        registerSlab(BlockList.pinkWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.PINK.getMetadata());
        registerSlab(BlockList.grayWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.GRAY.getMetadata());
        registerSlab(BlockList.silverWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.SILVER.getMetadata());
        registerSlab(BlockList.cyanWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.CYAN.getMetadata());
        registerSlab(BlockList.purpleWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.PURPLE.getMetadata());
        registerSlab(BlockList.blueWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.BLUE.getMetadata());
        registerSlab(BlockList.brownWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.BROWN.getMetadata());
        registerSlab(BlockList.greenWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.GREEN.getMetadata());
        registerSlab(BlockList.redWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.RED.getMetadata());
        registerSlab(BlockList.blackWoolSlab.getSingleSlab(), 0, Blocks.WOOL, EnumDyeColor.BLACK.getMetadata());
        registerSlab(BlockList.whiteHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.WHITE.getMetadata());
        registerSlab(BlockList.orangeHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.ORANGE.getMetadata());
        registerSlab(BlockList.magentaHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.MAGENTA.getMetadata());
        registerSlab(BlockList.light_blueHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.LIGHT_BLUE.getMetadata());
        registerSlab(BlockList.yellowHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.YELLOW.getMetadata());
        registerSlab(BlockList.limeHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.LIME.getMetadata());
        registerSlab(BlockList.pinkHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.PINK.getMetadata());
        registerSlab(BlockList.grayHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.GRAY.getMetadata());
        registerSlab(BlockList.silverHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.SILVER.getMetadata());
        registerSlab(BlockList.cyanHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.CYAN.getMetadata());
        registerSlab(BlockList.purpleHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.PURPLE.getMetadata());
        registerSlab(BlockList.blueHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.BLUE.getMetadata());
        registerSlab(BlockList.brownHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.BROWN.getMetadata());
        registerSlab(BlockList.greenHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.GREEN.getMetadata());
        registerSlab(BlockList.redHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.RED.getMetadata());
        registerSlab(BlockList.blackHardenedClaySlab.getSingleSlab(), 0, Blocks.STAINED_HARDENED_CLAY, EnumDyeColor.BLACK.getMetadata());
        registerSlab(BlockList.mossyCobblestoneSlab.getSingleSlab(), Blocks.MOSSY_COBBLESTONE);
        registerSlab(BlockList.prismarineBrickSlab.getSingleSlab(), 0, Blocks.PRISMARINE, BlockPrismarine.BRICKS_META);
        registerSlab(BlockList.darkPrismarineSlab.getSingleSlab(), 0, Blocks.PRISMARINE, BlockPrismarine.DARK_META);
        registerSlab(BlockList.hardenedClaySlab.getSingleSlab(), Blocks.HARDENED_CLAY);
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
        registerSlab(BlockList.whiteClayTileSlab.getSingleSlab(), BlockList.whiteClayTile);
        registerSlab(BlockList.whiteGlassSlab.getSingleSlab(), 0, Blocks.GLASS, EnumDyeColor.WHITE.getMetadata());
        //slabadder
    }

    private void registerLatticeRecipes() {
        registerLattice(BlockList.acaciaLattice, Blocks.PLANKS, BlockPlanks.EnumType.ACACIA.getMetadata());
        registerLattice(BlockList.bigOakLattice, Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK.getMetadata());
        registerLattice(BlockList.birchLattice, Blocks.PLANKS, BlockPlanks.EnumType.BIRCH.getMetadata());
        registerLattice(BlockList.jungleLattice, Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE.getMetadata());
        registerLattice(BlockList.oakLattice, Blocks.PLANKS, BlockPlanks.EnumType.OAK.getMetadata());
        registerLattice(BlockList.spruceLattice, Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE.getMetadata());
    }

    private void removeVanillaRecipes() {
        removeBlockRecipe(Blocks.STONE_SLAB);

        // Remove polished andesite/diorite/granite recipes
        removeBlockRecipe(Blocks.STONE, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata());
        removeBlockRecipe(Blocks.STONE, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata());
        removeBlockRecipe(Blocks.STONE, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata());

        // Remove Stair recipes
        removeBlockRecipe(Blocks.SANDSTONE_STAIRS);
        removeBlockRecipe(Blocks.STONE_STAIRS);
        removeBlockRecipe(Blocks.SPRUCE_STAIRS);
        removeBlockRecipe(Blocks.ACACIA_STAIRS);
        removeBlockRecipe(Blocks.BIRCH_STAIRS);
        removeBlockRecipe(Blocks.DARK_OAK_STAIRS);
        removeBlockRecipe(Blocks.JUNGLE_STAIRS);
        removeBlockRecipe(Blocks.OAK_STAIRS);
        removeBlockRecipe(Blocks.QUARTZ_STAIRS);
        removeBlockRecipe(Blocks.RED_SANDSTONE_STAIRS);
        removeBlockRecipe(Blocks.NETHER_BRICK_STAIRS);
        removeBlockRecipe(Blocks.BRICK_STAIRS);
        removeBlockRecipe(Blocks.STONE_BRICK_STAIRS);
    }

    private void reregisterVanillaRecipes() {
        // Re-register polished andesite/diorite/granite
        registerBlock(Blocks.STONE, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata(),
                Blocks.STONE, BlockStone.EnumType.ANDESITE.getMetadata());
        registerBlock(Blocks.STONE, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata(),
                Blocks.STONE, BlockStone.EnumType.DIORITE.getMetadata());
        registerBlock(Blocks.STONE, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata(),
                Blocks.STONE, BlockStone.EnumType.GRANITE.getMetadata());

        // Re-register default stairs.
        registerStairs(Blocks.STONE_STAIRS, Blocks.COBBLESTONE);
        registerStairs(Blocks.SPRUCE_STAIRS, Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE.getMetadata());
        registerStairs(Blocks.ACACIA_STAIRS, Blocks.PLANKS, BlockPlanks.EnumType.ACACIA.getMetadata());
        registerStairs(Blocks.BIRCH_STAIRS, Blocks.PLANKS, BlockPlanks.EnumType.BIRCH.getMetadata());
        registerStairs(Blocks.DARK_OAK_STAIRS, Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK.getMetadata());
        registerStairs(Blocks.JUNGLE_STAIRS, Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE.getMetadata());
        registerStairs(Blocks.OAK_STAIRS, Blocks.PLANKS, BlockPlanks.EnumType.OAK.getMetadata());
        registerStairs(Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK);
        registerStairs(Blocks.RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE);
        registerStairs(Blocks.NETHER_BRICK_STAIRS, Blocks.NETHER_BRICK);
        registerStairs(Blocks.SANDSTONE_STAIRS, Blocks.SANDSTONE, BlockSandStone.EnumType.DEFAULT.getMetadata());
        registerStairs(Blocks.STONE_BRICK_STAIRS, Blocks.STONEBRICK, BlockStoneBrick.EnumType.DEFAULT.getMetadata());

        // Re-register normal slabs.
        registerSlab(Blocks.STONE_SLAB, BlockStoneSlab.EnumType.COBBLESTONE.getMetadata(), Blocks.COBBLESTONE, 0);
        registerSlab(Blocks.STONE_SLAB, BlockStoneSlab.EnumType.QUARTZ.getMetadata(), Blocks.QUARTZ_BLOCK, 0);
        registerSlab(Blocks.STONE_SLAB, BlockStoneSlab.EnumType.BRICK.getMetadata(), Blocks.BRICK_BLOCK, 0);
        registerSlab(Blocks.STONE_SLAB, BlockStoneSlab.EnumType.SAND.getMetadata(), Blocks.SANDSTONE, 0);
        registerSlab(Blocks.STONE_SLAB, BlockStoneSlab.EnumType.STONE.getMetadata(), Blocks.STONE, 0);
        registerSlab(Blocks.STONE_SLAB, BlockStoneSlab.EnumType.SMOOTHBRICK.getMetadata(), Blocks.STONEBRICK, 0);
        registerSlab(Blocks.STONE_SLAB, BlockStoneSlab.EnumType.NETHERBRICK.getMetadata(), Blocks.NETHER_BRICK, 0);
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
        while (remover.hasNext()) {
            Object recipeObject = remover.next();
            if (recipeObject instanceof IRecipe) {
                IRecipe recipe = (IRecipe) recipeObject;
                ItemStack itemStack = recipe.getRecipeOutput();
                if (itemStack != null && itemStack.getItem() == item) {
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

    private void registerChiseled(Block outputBlock, Block inputSlab) {
        ItemStack chiseledBlockStack = new ItemStack(outputBlock, 1);
        ItemStack slabStack = new ItemStack(inputSlab, 1);
        GameRegistry.addRecipe(chiseledBlockStack, "x", "x", 'x', slabStack);
    }

    private void registerTorch(Block torchBlock, Item stickItem) {
        ItemStack torchStack = new ItemStack(torchBlock, 4);
        ItemStack stickStack = new ItemStack(stickItem, 1);
        ItemStack coalStack = new ItemStack(Items.COAL, 1);
        ItemStack charcoalStack = new ItemStack(Items.COAL, 1, 1);
        GameRegistry.addRecipe(torchStack, "x", "y", 'x', coalStack, 'y', stickStack);
        GameRegistry.addRecipe(torchStack, "x", "y", 'x', charcoalStack, 'y', stickStack);
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

    private void registerLattice(Block latticeBlock, Block woodBlock) {
        this.registerLattice(latticeBlock, woodBlock, 0);
    }

    private void registerLattice(Block latticeBlock, Block woodBlock, int meta) {
        ItemStack woodStack = new ItemStack(woodBlock, 1, meta);
        ItemStack stickStack = new ItemStack(Items.STICK, 1);
        ItemStack latticeStack = new ItemStack(latticeBlock, 3);
        GameRegistry.addRecipe(latticeStack, "x x", " y ", "x x", 'x', stickStack, 'y', woodStack);
    }
}
