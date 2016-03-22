package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Lime Stained Clay Stairs.
 */
public class LimeHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "lime_hardened_clay_stairs";

    public LimeHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
