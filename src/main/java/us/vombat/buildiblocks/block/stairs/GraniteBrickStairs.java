package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Granite Brick Stairs
 */
public class GraniteBrickStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "granite_brick_stairs";

    public GraniteBrickStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
