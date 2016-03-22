package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Green Stained Clay Stairs.
 */
public class GreenHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "green_hardened_clay_stairs";

    public GreenHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
