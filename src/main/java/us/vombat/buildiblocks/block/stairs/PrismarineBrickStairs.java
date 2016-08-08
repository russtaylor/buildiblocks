package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Prismarine Brick Stairs.
 */
public class PrismarineBrickStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "prismarine_brick_stairs";

    public PrismarineBrickStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
