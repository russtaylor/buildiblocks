package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Brown Wool Stairs.
 */
public class BrownWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "brown_wool_stairs";

    public BrownWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
