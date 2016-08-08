package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Brown Wool Stairs.
 */
public class BrownWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "brown_wool_stairs";

    public BrownWoolStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
