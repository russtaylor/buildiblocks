package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Lime Wool Stairs.
 */
public class LimeWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "lime_wool_stairs";

    public LimeWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
