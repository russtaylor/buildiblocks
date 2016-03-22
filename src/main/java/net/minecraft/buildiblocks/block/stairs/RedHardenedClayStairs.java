package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Red Stained Clay Stairs.
 */
public class RedHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "red_hardened_clay_stairs";

    public RedHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
