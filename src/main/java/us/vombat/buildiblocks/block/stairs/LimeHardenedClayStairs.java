package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Lime Stained Clay Stairs.
 */
public class LimeHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "lime_hardened_clay_stairs";

    public LimeHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
