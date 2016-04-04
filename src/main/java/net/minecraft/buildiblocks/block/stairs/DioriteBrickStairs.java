package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Diorite Brick Stairs
 */
public class DioriteBrickStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "diorite_brick_stairs";

    public DioriteBrickStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
