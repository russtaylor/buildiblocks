package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Pink Wool Stairs.
 */
public class PinkWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "pink_wool_stairs";

    public PinkWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
