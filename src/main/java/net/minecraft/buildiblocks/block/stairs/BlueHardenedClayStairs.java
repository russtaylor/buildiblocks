package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Blue Stained Clay Stairs.
 */
public class BlueHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "blue_hardened_clay_stairs";

    public BlueHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
