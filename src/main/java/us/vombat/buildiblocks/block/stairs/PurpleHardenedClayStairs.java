package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Purple Stained Clay Stairs.
 */
public class PurpleHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "purple_hardened_clay_stairs";

    public PurpleHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
