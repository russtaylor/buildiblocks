package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Purple Wool Stairs.
 */
public class PurpleWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "purple_wool_stairs";

    public PurpleWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
