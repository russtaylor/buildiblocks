package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Gray Wool Stairs.
 */
public class GrayWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "gray_wool_stairs";

    public GrayWoolStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
