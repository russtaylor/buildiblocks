package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Purple Wool Stairs.
 */
public class PurpleWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "purple_wool_stairs";

    public PurpleWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
