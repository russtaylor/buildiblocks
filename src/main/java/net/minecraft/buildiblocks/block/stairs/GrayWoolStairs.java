package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Gray Wool Stairs.
 */
public class GrayWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "gray_wool_stairs";

    public GrayWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
