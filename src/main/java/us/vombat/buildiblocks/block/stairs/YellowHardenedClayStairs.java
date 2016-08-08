package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Yellow Stained Clay Stairs.
 */
public class YellowHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "yellow_hardened_clay_stairs";

    public YellowHardenedClayStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
