package us.vombat.buildiblocks.block;

import net.minecraft.block.BlockColored;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.block.block.*;
import us.vombat.buildiblocks.block.fence.DiamondFence;
import us.vombat.buildiblocks.block.fence.EmeraldFence;
import us.vombat.buildiblocks.block.fence.GoldFence;
import us.vombat.buildiblocks.block.fence.IronFence;
import us.vombat.buildiblocks.block.misc.PaperWall;
import us.vombat.buildiblocks.block.pillar.*;
import us.vombat.buildiblocks.block.slab.*;
import us.vombat.buildiblocks.block.stairs.*;
import us.vombat.buildiblocks.block.torch.GoldTorch;
import us.vombat.buildiblocks.block.torch.IronTorch;
import us.vombat.buildiblocks.block.wall.*;

/**
 * Handles the creation of various types of blocks.
 */
public class BlockHandler {

    public void registerBlocks() {
        registerVanillaBlockExtensions();
    }

    private void registerVanillaBlockExtensions() {
        registerModBlocks();
        registerModTorches();
        registerModWalls();
        registerModFences();
        registerModStairs();
        registerModSlabs();
        registerModPillars();
    }

    private void registerModBlocks() {
        BlockList.clayTile = new ClayTile(Blocks.HARDENED_CLAY).register();
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
        BlockList.andesiteBrick = new AndesiteBrick(Blocks.STONE).register();
        BlockList.dioriteBrick = new DioriteBrick(Blocks.STONE).register();
        BlockList.graniteBrick = new GraniteBrick(Blocks.STONE).register();
        BlockList.chiseledGraniteBrick = new ChiseledGraniteBrick(Blocks.STONE).register();
        BlockList.chiseledDioriteBrick = new ChiseledDioriteBrick(Blocks.STONE).register();
        BlockList.chiseledAndesiteBrick = new ChiseledAndesiteBrick(BlockList.andesiteBrick).register();
        //blockadder
        BlockList.paperWall = new PaperWall().register();
    }

    private void registerModTorches() {
        BlockList.ironTorch = new IronTorch().register();
        BlockList.goldTorch = new GoldTorch().register();
    }

    private void registerModPillars() {
        BlockList.stonePillar = new StonePillar(Blocks.STONE).register();
        BlockList.andesitePillar = new AndesitePillar(BlockList.andesiteBrick).register();
        BlockList.dioritePillar = new DioritePillar(Blocks.STONE).register();
        BlockList.granitePillar = new GranitePillar(BlockList.graniteBrick).register();
        BlockList.carvedBirchWood = new CarvedBirchWood(Blocks.LOG).register();
        BlockList.carvedBirchLog = new CarvedBirchLog(Blocks.LOG).register();
        BlockList.carvedOakWood = new CarvedOakWood(Blocks.LOG).register();
        BlockList.carvedOakLog = new CarvedOakLog(Blocks.LOG).register();
        BlockList.carvedDarkOakWood = new CarvedDarkOakWood(Blocks.LOG).register();
        BlockList.carvedDarkOakLog = new CarvedDarkOakLog(Blocks.LOG).register();
        BlockList.carvedJungleWood = new CarvedJungleWood(Blocks.LOG).register();
        BlockList.carvedJungleLog = new CarvedJungleLog(Blocks.LOG).register();
        BlockList.carvedAcaciaWood = new CarvedAcaciaWood(Blocks.LOG).register();
        BlockList.carvedAcaciaLog = new CarvedAcaciaLog(Blocks.LOG).register();
        BlockList.carvedSpruceWood = new CarvedSpruceWood(Blocks.LOG).register();
        BlockList.carvedSpruceLog = new CarvedSpruceLog(Blocks.LOG).register();
        //pillaradder
    }

    private void registerModWalls() {
        BlockList.netherQuartzWall = new NetherQuartzWall(Blocks.QUARTZ_BLOCK).register();
        BlockList.netherBrickWall = new NetherBrickWall(Blocks.NETHER_BRICK).register();
        BlockList.stoneWall = new StoneWall(Blocks.STONE).register();
        BlockList.stoneBrickWall = new StoneBrickWall(Blocks.STONEBRICK).register();
        BlockList.sandstoneWall = new SandstoneWall(Blocks.SANDSTONE).register();
        BlockList.sandstoneBrickWall = new SandstoneBrickWall(Blocks.SANDSTONE).register();
        BlockList.brickWall = new BrickWall(Blocks.BRICK_BLOCK).register();
        BlockList.lapisLazuliWall = new LapisLazuliWall(Blocks.LAPIS_BLOCK).register();
        BlockList.polishedAndesiteWall = new PolishedAndesiteWall(Blocks.STONE).register();
        BlockList.polishedGraniteWall = new PolishedGraniteWall(Blocks.STONE).register();
        BlockList.polishedDioriteWall = new PolishedDioriteWall(Blocks.STONE).register();
        BlockList.crackedStoneBrickWall = new CrackedStoneBrickWall(Blocks.STONE).register();
        BlockList.mossyStoneBrickWall = new MossyStoneBrickWall(Blocks.STONE).register();
        BlockList.obsidianWall = new ObsidianWall(Blocks.OBSIDIAN).register();
        BlockList.emeraldWall = new EmeraldWall(Blocks.EMERALD_BLOCK).register();
        BlockList.mossyCobblestoneWall = new MossyCobblestoneWall(Blocks.MOSSY_COBBLESTONE).register();
        BlockList.andesiteBrickWall = new AndesiteBrickWall(Blocks.STONE).register();
        BlockList.dioriteBrickWall = new DioriteBrickWall(Blocks.STONE).register();
        BlockList.graniteBrickWall = new GraniteBrickWall(Blocks.STONE).register();
        //walladder
    }

    private void registerModFences() {
        BlockList.ironFence = new IronFence(Blocks.IRON_BLOCK).register();
        BlockList.goldFence = new GoldFence(Blocks.GOLD_BLOCK).register();
        BlockList.diamondFence = new DiamondFence(Blocks.DIAMOND_BLOCK).register();
        BlockList.emeraldFence = new EmeraldFence(Blocks.EMERALD_BLOCK).register();
    }

    private void registerModStairs() {
        BlockList.ironStairs = new IronStairs(Blocks.IRON_BLOCK).register();
        BlockList.goldStairs = new GoldStairs(Blocks.GOLD_BLOCK).register();
        BlockList.diamondStairs = new DiamondStairs(Blocks.DIAMOND_BLOCK).register();
        BlockList.polishedAndesiteStairs = new PolishedAndesiteStairs(Blocks.STONE).register();
        BlockList.polishedDioriteStairs = new PolishedDioriteStairs(Blocks.STONE).register();
        BlockList.polishedGraniteStairs = new PolishedGraniteStairs(Blocks.STONE).register();
        BlockList.lapisLazuliStairs = new LapisLazuliStairs(Blocks.LAPIS_BLOCK).register();
        BlockList.smoothSandstoneStairs = new SmoothSandstoneStairs(Blocks.SANDSTONE).register();
        BlockList.hardenedClayStairs = new HardenedClayStairs((BlockColored) Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.crackedStoneBrickStairs = new CrackedStoneBrickStairs(Blocks.STONEBRICK).register();
        BlockList.mossyStoneBrickStairs = new MossyStoneBrickStairs(Blocks.STONEBRICK).register();
        BlockList.obsidianStairs = new ObsidianStairs(Blocks.OBSIDIAN).register();
        BlockList.emeraldStairs = new EmeraldStairs(Blocks.EMERALD_BLOCK).register();
        BlockList.hayStairs = new HayStairs(Blocks.HAY_BLOCK).register();
        BlockList.orangeWoolStairs = new OrangeWoolStairs(Blocks.WOOL).register();
        BlockList.whiteWoolStairs = new WhiteWoolStairs(Blocks.WOOL).register();
        BlockList.magentaWoolStairs = new MagentaWoolStairs(Blocks.WOOL).register();
        BlockList.lightBlueWoolStairs = new LightBlueWoolStairs(Blocks.WOOL).register();
        BlockList.yellowWoolStairs = new YellowWoolStairs(Blocks.WOOL).register();
        BlockList.limeWoolStairs = new LimeWoolStairs(Blocks.WOOL).register();
        BlockList.pinkWoolStairs = new PinkWoolStairs(Blocks.WOOL).register();
        BlockList.grayWoolStairs = new GrayWoolStairs(Blocks.WOOL).register();
        BlockList.silverWoolStairs = new SilverWoolStairs(Blocks.WOOL).register();
        BlockList.cyanWoolStairs = new CyanWoolStairs(Blocks.WOOL).register();
        BlockList.purpleWoolStairs = new PurpleWoolStairs(Blocks.WOOL).register();
        BlockList.blueWoolStairs = new BlueWoolStairs(Blocks.WOOL).register();
        BlockList.brownWoolStairs = new BrownWoolStairs(Blocks.WOOL).register();
        BlockList.greenWoolStairs = new GreenWoolStairs(Blocks.WOOL).register();
        BlockList.redWoolStairs = new RedWoolStairs(Blocks.WOOL).register();
        BlockList.blackWoolStairs = new BlackWoolStairs(Blocks.WOOL).register();
        BlockList.whiteHardenedClayStairs = new WhiteHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.orangeHardenedClayStairs = new OrangeHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.magentaHardenedClayStairs = new MagentaHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.light_blueHardenedClayStairs = new Light_blueHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.yellowHardenedClayStairs = new YellowHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.limeHardenedClayStairs = new LimeHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.pinkHardenedClayStairs = new PinkHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.grayHardenedClayStairs = new GrayHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.silverHardenedClayStairs = new SilverHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.cyanHardenedClayStairs = new CyanHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.purpleHardenedClayStairs = new PurpleHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.blueHardenedClayStairs = new BlueHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.brownHardenedClayStairs = new BrownHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.greenHardenedClayStairs = new GreenHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.redHardenedClayStairs = new RedHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.blackHardenedClayStairs = new BlackHardenedClayStairs(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.mossyCobblestoneStairs = new MossyCobblestoneStairs(Blocks.MOSSY_COBBLESTONE).register();
        BlockList.prismarineBrickStairs = new PrismarineBrickStairs(Blocks.PRISMARINE).register();
        BlockList.darkPrismarineStairs = new DarkPrismarineStairs(Blocks.PRISMARINE).register();
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
        BlockList.andesiteBrickStairs = new AndesiteBrickStairs(Blocks.STONE).register();
        BlockList.dioriteBrickStairs = new DioriteBrickStairs(Blocks.STONE).register();
        BlockList.graniteBrickStairs = new GraniteBrickStairs(Blocks.STONE).register();
        //stairsadder
    }

    private void registerModSlabs() {
        BlockList.diamondSlab = new DiamondSlab(Blocks.DIAMOND_BLOCK).register();
        BlockList.ironSlab = new IronSlab(Blocks.IRON_BLOCK).register();
        BlockList.goldSlab = new GoldSlab(Blocks.GOLD_BLOCK).register();
        BlockList.polishedAndesiteSlab = new PolishedAndesiteSlab(Blocks.STONE).register();
        BlockList.polishedDioriteSlab = new PolishedDioriteSlab(Blocks.STONE).register();
        BlockList.polishedGraniteSlab = new PolishedGraniteSlab(Blocks.STONE).register();
        BlockList.lapisLazuliSlab = new LapisLazuliSlab(Blocks.LAPIS_BLOCK).register();
        BlockList.smoothSandstoneSlab = new SmoothSandstoneSlab(Blocks.SANDSTONE).register();
        BlockList.crackedStoneBrickSlab = new CrackedStoneBrickSlab(Blocks.STONE).register();
        BlockList.mossyStoneBrickSlab = new MossyStoneBrickSlab(Blocks.STONE).register();
        BlockList.obsidianSlab = new ObsidianSlab(Blocks.OBSIDIAN).register();
        BlockList.emeraldSlab = new EmeraldSlab(Blocks.EMERALD_BLOCK).register();
        BlockList.haySlab = new HaySlab(Blocks.HAY_BLOCK).register();
        BlockList.orangeWoolSlab = new OrangeWoolSlab(Blocks.WOOL).register();
        BlockList.whiteWoolSlab = new WhiteWoolSlab(Blocks.WOOL).register();
        BlockList.magentaWoolSlab = new MagentaWoolSlab(Blocks.WOOL).register();
        BlockList.lightBlueWoolSlab = new LightBlueWoolSlab(Blocks.WOOL).register();
        BlockList.yellowWoolSlab = new YellowWoolSlab(Blocks.WOOL).register();
        BlockList.limeWoolSlab = new LimeWoolSlab(Blocks.WOOL).register();
        BlockList.pinkWoolSlab = new PinkWoolSlab(Blocks.WOOL).register();
        BlockList.grayWoolSlab = new GrayWoolSlab(Blocks.WOOL).register();
        BlockList.silverWoolSlab = new SilverWoolSlab(Blocks.WOOL).register();
        BlockList.cyanWoolSlab = new CyanWoolSlab(Blocks.WOOL).register();
        BlockList.purpleWoolSlab = new PurpleWoolSlab(Blocks.WOOL).register();
        BlockList.blueWoolSlab = new BlueWoolSlab(Blocks.WOOL).register();
        BlockList.brownWoolSlab = new BrownWoolSlab(Blocks.WOOL).register();
        BlockList.greenWoolSlab = new GreenWoolSlab(Blocks.WOOL).register();
        BlockList.redWoolSlab = new RedWoolSlab(Blocks.WOOL).register();
        BlockList.blackWoolSlab = new BlackWoolSlab(Blocks.WOOL).register();
        BlockList.whiteHardenedClaySlab = new WhiteHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.orangeHardenedClaySlab = new OrangeHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.magentaHardenedClaySlab = new MagentaHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.light_blueHardenedClaySlab = new Light_blueHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.yellowHardenedClaySlab = new YellowHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.limeHardenedClaySlab = new LimeHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.pinkHardenedClaySlab = new PinkHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.grayHardenedClaySlab = new GrayHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.silverHardenedClaySlab = new SilverHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.cyanHardenedClaySlab = new CyanHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.purpleHardenedClaySlab = new PurpleHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.blueHardenedClaySlab = new BlueHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.brownHardenedClaySlab = new BrownHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.greenHardenedClaySlab = new GreenHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.redHardenedClaySlab = new RedHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.blackHardenedClaySlab = new BlackHardenedClaySlab(Blocks.STAINED_HARDENED_CLAY).register();
        BlockList.mossyCobblestoneSlab = new MossyCobblestoneSlab(Blocks.MOSSY_COBBLESTONE).register();
        BlockList.prismarineBrickSlab = new PrismarineBrickSlab(Blocks.PRISMARINE).register();
        BlockList.darkPrismarineSlab = new DarkPrismarineSlab(Blocks.PRISMARINE).register();
        BlockList.hardenedClaySlab = new HardenedClaySlab(Blocks.HARDENED_CLAY).register();
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
        BlockList.andesiteBrickSlab = new AndesiteBrickSlab(Blocks.STONE).register();
        BlockList.dioriteBrickSlab = new DioriteBrickSlab(Blocks.STONE).register();
        BlockList.graniteBrickSlab = new GraniteBrickSlab(Blocks.STONE).register();
        //slabadder
    }
}
