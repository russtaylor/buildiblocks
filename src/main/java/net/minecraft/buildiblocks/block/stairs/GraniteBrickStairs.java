package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Granite Brick Stairs
 */
public class GraniteBrickStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "granite_brick_stairs";

    public GraniteBrickStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
