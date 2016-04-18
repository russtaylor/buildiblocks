package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Mossy Stone Brick Stairs.
 */
public class MossyStoneBrickStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "mossy_stone_brick_stairs";

    public MossyStoneBrickStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
