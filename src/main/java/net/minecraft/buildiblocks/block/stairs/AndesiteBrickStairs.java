package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Andesite Brick Stairs
 */
public class AndesiteBrickStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "andesite_brick_stairs";

    public AndesiteBrickStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
