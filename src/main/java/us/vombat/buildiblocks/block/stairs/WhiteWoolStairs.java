package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for White Wool Stairs.
 */
public class WhiteWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "white_wool_stairs";

    public WhiteWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
