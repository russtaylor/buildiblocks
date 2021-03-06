package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Smooth Sandstone Stairs.
 *
 * Created by russt on 12/18/14.
 */
public class SmoothSandstoneStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "smooth_sandstone_stairs";

    public SmoothSandstoneStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
