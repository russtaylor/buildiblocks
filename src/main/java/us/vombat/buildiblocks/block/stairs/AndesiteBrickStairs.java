package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Andesite Brick Stairs
 */
public class AndesiteBrickStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "andesite_brick_stairs";

    public AndesiteBrickStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
