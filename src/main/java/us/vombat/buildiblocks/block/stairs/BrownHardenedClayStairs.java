package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Brown Stained Clay Stairs.
 */
public class BrownHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "brown_hardened_clay_stairs";

    public BrownHardenedClayStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
