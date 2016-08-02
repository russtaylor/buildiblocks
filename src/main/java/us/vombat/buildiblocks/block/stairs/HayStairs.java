package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Hay Stairs.
 */
public class HayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "hay_stairs";

    public HayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
