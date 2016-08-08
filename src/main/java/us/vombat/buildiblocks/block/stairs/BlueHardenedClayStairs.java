package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Blue Stained Clay Stairs.
 */
public class BlueHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "blue_hardened_clay_stairs";

    public BlueHardenedClayStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
