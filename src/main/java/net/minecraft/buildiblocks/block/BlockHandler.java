package net.minecraft.buildiblocks.block;

import net.minecraft.block.BlockColored;
import net.minecraft.buildiblocks.block.block.*;
import net.minecraft.buildiblocks.block.stairs.*;
import net.minecraft.buildiblocks.block.wall.*;
import net.minecraft.init.Blocks;
import net.minecraft.buildiblocks.block.fence.DiamondFence;
import net.minecraft.buildiblocks.block.fence.GoldFence;
import net.minecraft.buildiblocks.block.fence.IronFence;
import net.minecraft.buildiblocks.block.slab.*;

/**
 * Handles the creation of various types of blocks.
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
        registerPillars();
    }

    private void registerVanillaBlocks() {
        BlockList.clayTile = new ClayTile(Blocks.hardened_clay).register();
        BlockList.orangeClayTile = new OrangeClayTile(BlockList.clayTile).register();
        BlockList.magentaClayTile = new MagentaClayTile(BlockList.clayTile).register();
        BlockList.lightBlueClayTile = new LightBlueClayTile(BlockList.clayTile).register();
        BlockList.yellowClayTile = new YellowClayTile(BlockList.clayTile).register();
        BlockList.limeClayTile = new LimeClayTile(BlockList.clayTile).register();
        BlockList.pinkClayTile = new PinkClayTile(BlockList.clayTile).register();
        BlockList.grayClayTile = new GrayClayTile(BlockList.clayTile).register();
        BlockList.silverClayTile = new SilverClayTile(BlockList.clayTile).register();
        BlockList.cyanClayTile = new CyanClayTile(BlockList.clayTile).register();
        BlockList.purpleClayTile = new PurpleClayTile(BlockList.clayTile).register();
        BlockList.blueClayTile = new BlueClayTile(BlockList.clayTile).register();
        BlockList.brownClayTile = new BrownClayTile(BlockList.clayTile).register();
        BlockList.greenClayTile = new GreenClayTile(BlockList.clayTile).register();
        BlockList.redClayTile = new RedClayTile(BlockList.clayTile).register();
        BlockList.blackClayTile = new BlackClayTile(BlockList.clayTile).register();
        //blockadder
    }

    private void registerPillars() {
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
        BlockList.mossyCobblestoneWall = new MossyCobblestoneWall(Blocks.mossy_cobblestone).register();
        //walladder
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
        BlockList.orangeWoolStairs = new OrangeWoolStairs(Blocks.wool).register();
        BlockList.whiteWoolStairs = new WhiteWoolStairs(Blocks.wool).register();
        BlockList.magentaWoolStairs = new MagentaWoolStairs(Blocks.wool).register();
        BlockList.lightBlueWoolStairs = new LightBlueWoolStairs(Blocks.wool).register();
        BlockList.yellowWoolStairs = new YellowWoolStairs(Blocks.wool).register();
        BlockList.limeWoolStairs = new LimeWoolStairs(Blocks.wool).register();
        BlockList.pinkWoolStairs = new PinkWoolStairs(Blocks.wool).register();
        BlockList.grayWoolStairs = new GrayWoolStairs(Blocks.wool).register();
        BlockList.silverWoolStairs = new SilverWoolStairs(Blocks.wool).register();
        BlockList.cyanWoolStairs = new CyanWoolStairs(Blocks.wool).register();
        BlockList.purpleWoolStairs = new PurpleWoolStairs(Blocks.wool).register();
        BlockList.blueWoolStairs = new BlueWoolStairs(Blocks.wool).register();
        BlockList.brownWoolStairs = new BrownWoolStairs(Blocks.wool).register();
        BlockList.greenWoolStairs = new GreenWoolStairs(Blocks.wool).register();
        BlockList.redWoolStairs = new RedWoolStairs(Blocks.wool).register();
        BlockList.blackWoolStairs = new BlackWoolStairs(Blocks.wool).register();
        BlockList.whiteHardenedClayStairs = new WhiteHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.orangeHardenedClayStairs = new OrangeHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.magentaHardenedClayStairs = new MagentaHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.light_blueHardenedClayStairs = new Light_blueHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.yellowHardenedClayStairs = new YellowHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.limeHardenedClayStairs = new LimeHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.pinkHardenedClayStairs = new PinkHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.grayHardenedClayStairs = new GrayHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.silverHardenedClayStairs = new SilverHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.cyanHardenedClayStairs = new CyanHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.purpleHardenedClayStairs = new PurpleHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.blueHardenedClayStairs = new BlueHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.brownHardenedClayStairs = new BrownHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.greenHardenedClayStairs = new GreenHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.redHardenedClayStairs = new RedHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.blackHardenedClayStairs = new BlackHardenedClayStairs(Blocks.stained_hardened_clay).register();
        BlockList.mossyCobblestoneStairs = new MossyCobblestoneStairs(Blocks.mossy_cobblestone).register();
        BlockList.prismarineBrickStairs = new PrismarineBrickStairs(Blocks.prismarine).register();
        BlockList.darkPrismarineStairs = new DarkPrismarineStairs(Blocks.prismarine).register();
        BlockList.clayTileStairs = new ClayTileStairs(BlockList.clayTile).register();
        BlockList.orangeClayTileStairs = new OrangeClayTileStairs(BlockList.clayTile).register();
        BlockList.magentaClayTileStairs = new MagentaClayTileStairs(BlockList.clayTile).register();
        BlockList.lightBlueClayTileStairs = new LightBlueClayTileStairs(BlockList.clayTile).register();
        BlockList.yellowClayTileStairs = new YellowClayTileStairs(BlockList.clayTile).register();
        BlockList.limeClayTileStairs = new LimeClayTileStairs(BlockList.clayTile).register();
        BlockList.pinkClayTileStairs = new PinkClayTileStairs(BlockList.clayTile).register();
        BlockList.grayClayTileStairs = new GrayClayTileStairs(BlockList.clayTile).register();
        BlockList.silverClayTileStairs = new SilverClayTileStairs(BlockList.clayTile).register();
        BlockList.cyanClayTileStairs = new CyanClayTileStairs(BlockList.clayTile).register();
        BlockList.purpleClayTileStairs = new PurpleClayTileStairs(BlockList.clayTile).register();
        BlockList.blueClayTileStairs = new BlueClayTileStairs(BlockList.clayTile).register();
        BlockList.brownClayTileStairs = new BrownClayTileStairs(BlockList.clayTile).register();
        BlockList.greenClayTileStairs = new GreenClayTileStairs(BlockList.clayTile).register();
        BlockList.redClayTileStairs = new RedClayTileStairs(BlockList.clayTile).register();
        BlockList.blackClayTileStairs = new BlackClayTileStairs(BlockList.clayTile).register();
        //stairsadder
    }

    private void registerVanillaSlabs() {
        BlockList.diamondSlab = new DiamondSlab(Blocks.diamond_block).register();
        BlockList.ironSlab = new IronSlab(Blocks.iron_block).register();
        BlockList.goldSlab = new GoldSlab(Blocks.gold_block).register();
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
        BlockList.orangeWoolSlab = new OrangeWoolSlab(Blocks.wool).register();
        BlockList.whiteWoolSlab = new WhiteWoolSlab(Blocks.wool).register();
        BlockList.magentaWoolSlab = new MagentaWoolSlab(Blocks.wool).register();
        BlockList.lightBlueWoolSlab = new LightBlueWoolSlab(Blocks.wool).register();
        BlockList.yellowWoolSlab = new YellowWoolSlab(Blocks.wool).register();
        BlockList.limeWoolSlab = new LimeWoolSlab(Blocks.wool).register();
        BlockList.pinkWoolSlab = new PinkWoolSlab(Blocks.wool).register();
        BlockList.grayWoolSlab = new GrayWoolSlab(Blocks.wool).register();
        BlockList.silverWoolSlab = new SilverWoolSlab(Blocks.wool).register();
        BlockList.cyanWoolSlab = new CyanWoolSlab(Blocks.wool).register();
        BlockList.purpleWoolSlab = new PurpleWoolSlab(Blocks.wool).register();
        BlockList.blueWoolSlab = new BlueWoolSlab(Blocks.wool).register();
        BlockList.brownWoolSlab = new BrownWoolSlab(Blocks.wool).register();
        BlockList.greenWoolSlab = new GreenWoolSlab(Blocks.wool).register();
        BlockList.redWoolSlab = new RedWoolSlab(Blocks.wool).register();
        BlockList.blackWoolSlab = new BlackWoolSlab(Blocks.wool).register();
        BlockList.whiteHardenedClaySlab = new WhiteHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.orangeHardenedClaySlab = new OrangeHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.magentaHardenedClaySlab = new MagentaHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.light_blueHardenedClaySlab = new Light_blueHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.yellowHardenedClaySlab = new YellowHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.limeHardenedClaySlab = new LimeHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.pinkHardenedClaySlab = new PinkHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.grayHardenedClaySlab = new GrayHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.silverHardenedClaySlab = new SilverHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.cyanHardenedClaySlab = new CyanHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.purpleHardenedClaySlab = new PurpleHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.blueHardenedClaySlab = new BlueHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.brownHardenedClaySlab = new BrownHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.greenHardenedClaySlab = new GreenHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.redHardenedClaySlab = new RedHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.blackHardenedClaySlab = new BlackHardenedClaySlab(Blocks.stained_hardened_clay).register();
        BlockList.mossyCobblestoneSlab = new MossyCobblestoneSlab(Blocks.mossy_cobblestone).register();
        BlockList.prismarineBrickSlab = new PrismarineBrickSlab(Blocks.prismarine).register();
        BlockList.darkPrismarineSlab = new DarkPrismarineSlab(Blocks.prismarine).register();
        BlockList.hardenedClaySlab = new HardenedClaySlab(Blocks.hardened_clay).register();
        BlockList.clayTileSlab = new ClayTileSlab(BlockList.clayTile).register();
        BlockList.orangeClayTileSlab = new OrangeClayTileSlab(BlockList.clayTile).register();
        BlockList.magentaClayTileSlab = new MagentaClayTileSlab(BlockList.clayTile).register();
        BlockList.lightBlueClayTileSlab = new LightBlueClayTileSlab(BlockList.clayTile).register();
        BlockList.yellowClayTileSlab = new YellowClayTileSlab(BlockList.clayTile).register();
        BlockList.limeClayTileSlab = new LimeClayTileSlab(BlockList.clayTile).register();
        BlockList.pinkClayTileSlab = new PinkClayTileSlab(BlockList.clayTile).register();
        BlockList.grayClayTileSlab = new GrayClayTileSlab(BlockList.clayTile).register();
        BlockList.silverClayTileSlab = new SilverClayTileSlab(BlockList.clayTile).register();
        BlockList.cyanClayTileSlab = new CyanClayTileSlab(BlockList.clayTile).register();
        BlockList.purpleClayTileSlab = new PurpleClayTileSlab(BlockList.clayTile).register();
        BlockList.blueClayTileSlab = new BlueClayTileSlab(BlockList.clayTile).register();
        BlockList.brownClayTileSlab = new BrownClayTileSlab(BlockList.clayTile).register();
        BlockList.greenClayTileSlab = new GreenClayTileSlab(BlockList.clayTile).register();
        BlockList.redClayTileSlab = new RedClayTileSlab(BlockList.clayTile).register();
        BlockList.blackClayTileSlab = new BlackClayTileSlab(BlockList.clayTile).register();
        //slabadder
    }
}
