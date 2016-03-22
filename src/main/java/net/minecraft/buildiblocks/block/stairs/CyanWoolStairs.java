package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Cyan Wool Stairs.
 */
public class CyanWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "cyan_wool_stairs";

    public CyanWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
