package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Prismarine Brick Stairs.
 */
public class PrismarineBrickStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "prismarine_brick_stairs";

    public PrismarineBrickStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
