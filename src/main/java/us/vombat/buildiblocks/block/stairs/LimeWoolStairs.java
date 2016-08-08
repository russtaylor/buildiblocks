package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Lime Wool Stairs.
 */
public class LimeWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "lime_wool_stairs";

    public LimeWoolStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
