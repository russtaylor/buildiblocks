package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Light_blue Stained Clay Stairs.
 */
public class Light_blueHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "light_blue_hardened_clay_stairs";

    public Light_blueHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
