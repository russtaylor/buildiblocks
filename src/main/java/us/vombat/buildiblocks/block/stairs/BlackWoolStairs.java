package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Black Wool Stairs.
 */
public class BlackWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "black_wool_stairs";

    public BlackWoolStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
