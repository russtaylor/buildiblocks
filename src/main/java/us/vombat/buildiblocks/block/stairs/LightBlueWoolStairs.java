package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Light Blue Wool Stairs.
 */
public class LightBlueWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "light_blue_wool_stairs";

    public LightBlueWoolStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
