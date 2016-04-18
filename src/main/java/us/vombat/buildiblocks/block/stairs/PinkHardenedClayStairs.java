package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Pink Stained Clay Stairs.
 */
public class PinkHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "pink_hardened_clay_stairs";

    public PinkHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
