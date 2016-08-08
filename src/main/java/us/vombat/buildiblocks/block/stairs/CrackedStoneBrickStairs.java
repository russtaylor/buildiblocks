package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Cracked Stone Brick Stairs.
 */
public class CrackedStoneBrickStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "cracked_stone_brick_stairs";

    public CrackedStoneBrickStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
