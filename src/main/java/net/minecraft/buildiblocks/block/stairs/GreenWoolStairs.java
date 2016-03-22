package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Green Wool Stairs.
 */
public class GreenWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "green_wool_stairs";

    public GreenWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
