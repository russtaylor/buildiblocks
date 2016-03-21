package net.minecraft.buildiblocks.block;

import net.minecraft.block.BlockColored;
import net.minecraft.buildiblocks.block.blocks.StonePillar;
import net.minecraft.buildiblocks.block.stairs.*;
import net.minecraft.buildiblocks.block.walls.*;
import net.minecraft.init.Blocks;
import net.minecraft.buildiblocks.block.fences.DiamondFence;
import net.minecraft.buildiblocks.block.fences.GoldFence;
import net.minecraft.buildiblocks.block.fences.IronFence;
import net.minecraft.buildiblocks.block.slabs.*;

import static net.minecraft.buildiblocks.block.BlockList.blockList;

/**
 * Handles the creation of various types of blocks.
 *
 * Created by russt on 11/26/14.
 */
public class BlockHandler {

    public void registerBlocks() {
        registerVanillaBlockExtensions();
    }

    private void registerVanillaBlockExtensions() {
        registerVanillaBlocks();
        registerVanillaWalls();
        registerVanillaFences();
        registerVanillaStairs();
        registerVanillaSlabs();
    }

    private void registerVanillaBlocks() {
        BlockList.stonePillar = new StonePillar(Blocks.stone).register();
    }

    private void registerVanillaWalls() {
        BlockList.netherQuartzWall = new NetherQuartzWall(Blocks.quartz_block).register();
        BlockList.netherBrickWall = new NetherBrickWall(Blocks.nether_brick).register();
        BlockList.stoneWall = new StoneWall(Blocks.stone).register();
        BlockList.stoneBrickWall = new StoneBrickWall(Blocks.stonebrick).register();
        BlockList.sandstoneWall = new SandstoneWall(Blocks.sandstone).register();
        BlockList.sandstoneBrickWall = new SandstoneBrickWall(Blocks.sandstone).register();
        BlockList.brickWall = new BrickWall(Blocks.brick_block).register();
        BlockList.lapisLazuliWall = new LapisLazuliWall(Blocks.lapis_block).register();
        BlockList.polishedAndesiteWall = new PolishedAndesiteWall(Blocks.stone).register();
        BlockList.polishedGraniteWall = new PolishedGraniteWall(Blocks.stone).register();
        BlockList.polishedDioriteWall = new PolishedDioriteWall(Blocks.stone).register();
        BlockList.crackedStoneBrickWall = new CrackedStoneBrickWall(Blocks.stone).register();
        BlockList.mossyStoneBrickWall = new MossyStoneBrickWall(Blocks.stone).register();
        BlockList.obsidianWall = new ObsidianWall(Blocks.obsidian).register();
        BlockList.emeraldWall = new EmeraldWall(Blocks.emerald_block).register();
    }

    private void registerVanillaFences() {
        BlockList.ironFence = new IronFence(Blocks.iron_block).register();
        BlockList.goldFence = new GoldFence(Blocks.gold_block).register();
        BlockList.diamondFence = new DiamondFence(Blocks.diamond_block).register();
    }

    private void registerVanillaStairs() {
        BlockList.ironStairs = new IronStairs(Blocks.iron_block).register();
        BlockList.goldStairs = new GoldStairs(Blocks.gold_block).register();
        BlockList.diamondStairs = new DiamondStairs(Blocks.diamond_block).register();
        BlockList.polishedAndesiteStairs = new PolishedAndesiteStairs(Blocks.stone).register();
        BlockList.polishedDioriteStairs = new PolishedDioriteStairs(Blocks.stone).register();
        BlockList.polishedGraniteStairs = new PolishedGraniteStairs(Blocks.stone).register();
        BlockList.lapisLazuliStairs = new LapisLazuliStairs(Blocks.lapis_block).register();
        BlockList.smoothSandstoneStairs = new SmoothSandstoneStairs(Blocks.sandstone).register();
        BlockList.hardenedClayStairs = new HardenedClayStairs((BlockColored) Blocks.stained_hardened_clay).register();
        BlockList.crackedStoneBrickStairs = new CrackedStoneBrickStairs(Blocks.stonebrick).register();
        BlockList.mossyStoneBrickStairs = new MossyStoneBrickStairs(Blocks.stonebrick).register();
        BlockList.obsidianStairs = new ObsidianStairs(Blocks.obsidian).register();
        BlockList.emeraldStairs = new EmeraldStairs(Blocks.emerald_block).register();
        BlockList.hayStairs = new HayStairs(Blocks.hay_block).register();
    }

    private void registerVanillaSlabs() {
        BlockList.diamondSlab = new DiamondSlab(Blocks.diamond_block).register();
        BlockList.ironSlab = new IronSlab(Blocks.iron_block).register();
        BlockList.goldSlab = new GoldSlab(Blocks.gold_block).register();
        BlockList.gravelSlab = new GravelSlab(Blocks.gravel).register();
        BlockList.dirtSlab = new DirtSlab(Blocks.dirt).register();
        BlockList.polishedAndesiteSlab = new PolishedAndesiteSlab(Blocks.stone).register();
        BlockList.polishedDioriteSlab = new PolishedDioriteSlab(Blocks.stone).register();
        BlockList.polishedGraniteSlab = new PolishedGraniteSlab(Blocks.stone).register();
        BlockList.lapisLazuliSlab = new LapisLazuliSlab(Blocks.lapis_block).register();
        BlockList.smoothSandstoneSlab = new SmoothSandstoneSlab(Blocks.sandstone).register();
        BlockList.crackedStoneBrickSlab = new CrackedStoneBrickSlab(Blocks.stone).register();
        BlockList.mossyStoneBrickSlab = new MossyStoneBrickSlab(Blocks.stone).register();
        BlockList.obsidianSlab = new ObsidianSlab(Blocks.obsidian).register();
        BlockList.emeraldSlab = new EmeraldSlab(Blocks.emerald_block).register();
        BlockList.haySlab = new HaySlab(Blocks.hay_block).register();
    }
}
