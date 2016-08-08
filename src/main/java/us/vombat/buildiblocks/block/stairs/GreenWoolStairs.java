package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Green Wool Stairs.
 */
public class GreenWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "green_wool_stairs";

    public GreenWoolStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
