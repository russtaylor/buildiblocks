package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Cyan Wool Stairs.
 */
public class CyanWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "cyan_wool_stairs";

    public CyanWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
