package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Black Stained Clay Stairs.
 */
public class BlackHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "black_hardened_clay_stairs";

    public BlackHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
