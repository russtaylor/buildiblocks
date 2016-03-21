package net.minecraft.buildiblocks.recipe;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.buildiblocks.block.BlockList;
import net.minecraft.buildiblocks.item.ItemList;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Handles creating the recipes needed by the mod.
 *
 * Created by russt on 12/12/14.
 */
public class RecipeHandler {
    public void registerRecipes() {
        removeVanillaRecipes();
        registerPillarRecipes();
        registerWallRecipes();
        registerStairRecipes();
        registerSlabRecipes();
        registerRodRecipes();
        registerFenceRecipes();
        reregisterVanillaRecipes();
    }

    private void registerRodRecipes() {
        registerRod(Items.iron_ingot, ItemList.ironRod);
        registerRod(Items.diamond, ItemList.diamondRod);
        registerRod(Items.gold_ingot, ItemList.goldRod);
    }

    private void registerRod(Item inputItem, Item outputItem) {
        ItemStack inputItemStack = new ItemStack(inputItem, 1);
        ItemStack outputItemStack = new ItemStack(outputItem, 4);
        GameRegistry.addRecipe(outputItemStack, "x", "x", 'x', inputItemStack);
    }

    private void registerPillarRecipes() {
        registerPillar(BlockList.stonePillar, Blocks.stone);
    }

    private void registerFenceRecipes() {
        registerFence(BlockList.ironFence, Items.iron_ingot, ItemList.ironRod);
        registerFence(BlockList.goldFence, Items.gold_ingot, ItemList.goldRod);
        registerFence(BlockList.diamondFence, Items.diamond, ItemList.diamondRod);
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
    }

    private void registerStairRecipes() {
        registerStair(BlockList.diamondStairs, Blocks.diamond_block);
        registerStair(BlockList.ironStairs, Blocks.iron_block);
        registerStair(BlockList.goldStairs, Blocks.gold_block);
        registerStair(BlockList.polishedAndesiteStairs, Blocks.stone, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata());
        registerStair(BlockList.polishedDioriteStairs, Blocks.stone, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata());
        registerStair(BlockList.polishedGraniteStairs, Blocks.stone, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata());
        registerStair(BlockList.lapisLazuliStairs, Blocks.lapis_block);
        registerStair(BlockList.smoothSandstoneStairs, Blocks.sandstone, BlockSandStone.EnumType.SMOOTH.getMetadata());
        registerStair(BlockList.crackedStoneBrickStairs, Blocks.stonebrick, BlockStoneBrick.EnumType.CRACKED.getMetadata());
        registerStair(BlockList.mossyStoneBrickStairs, Blocks.stonebrick, BlockStoneBrick.EnumType.MOSSY.getMetadata());
        registerStair(BlockList.obsidianStairs, Blocks.obsidian);
        registerStair(BlockList.emeraldStairs, Blocks.emerald_block);
        registerStair(BlockList.hayStairs, Blocks.hay_block);
    }

    private void registerSlabRecipes() {
        registerSlab(BlockList.diamondSlab.getSingleSlab(), Blocks.diamond_block);
        registerSlab(BlockList.ironSlab.getSingleSlab(), Blocks.iron_block);
        registerSlab(BlockList.goldSlab.getSingleSlab(), Blocks.gold_block);
        registerSlab(BlockList.gravelSlab.getSingleSlab(), Blocks.gravel);
        registerSlab(BlockList.dirtSlab.getSingleSlab(), Blocks.dirt);
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

    }

    private void removeVanillaRecipes() {
        removeBlockRecipe(Blocks.stone_slab);

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
        // Re-register default stairs.
        registerStair(Blocks.stone_stairs, Blocks.cobblestone);
        registerStair(Blocks.spruce_stairs, Blocks.planks, BlockPlanks.EnumType.SPRUCE.getMetadata());
        registerStair(Blocks.acacia_stairs, Blocks.planks, BlockPlanks.EnumType.ACACIA.getMetadata());
        registerStair(Blocks.birch_stairs, Blocks.planks, BlockPlanks.EnumType.BIRCH.getMetadata());
        registerStair(Blocks.dark_oak_stairs, Blocks.planks, BlockPlanks.EnumType.DARK_OAK.getMetadata());
        registerStair(Blocks.jungle_stairs, Blocks.planks, BlockPlanks.EnumType.JUNGLE.getMetadata());
        registerStair(Blocks.oak_stairs, Blocks.planks, BlockPlanks.EnumType.OAK.getMetadata());
        registerStair(Blocks.quartz_stairs, Blocks.quartz_block);
        registerStair(Blocks.red_sandstone_stairs, Blocks.red_sandstone);
        registerStair(Blocks.nether_brick_stairs, Blocks.nether_brick);
        registerStair(Blocks.sandstone_stairs, Blocks.sandstone, BlockSandStone.EnumType.DEFAULT.getMetadata());
        registerStair(Blocks.stone_brick_stairs, Blocks.stonebrick, BlockStoneBrick.EnumType.DEFAULT.getMetadata());

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
        Item item = Item.getItemFromBlock(block);
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
        ItemStack sourceItemStack = new ItemStack(sourceBlock, 1, meta);
        ItemStack pillarStack = new ItemStack(pillarBlock, 2);
        GameRegistry.addRecipe(pillarStack, "x", "x", 'x', sourceItemStack);
    }

    private void registerStair(Block stairBlock, Block sourceBlock) {
        this.registerStair(stairBlock, sourceBlock, 0);
    }

    private void registerStair(Block stairBlock, Block sourceBlock, int meta) {
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
}
