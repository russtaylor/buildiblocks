package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Brown Stained Clay Stairs.
 */
public class BrownHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "brown_hardened_clay_stairs";

    public BrownHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
