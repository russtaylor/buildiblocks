package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Red Wool Stairs.
 */
public class RedWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "red_wool_stairs";

    public RedWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
