package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Gray Stained Clay Stairs.
 */
public class GrayHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "gray_hardened_clay_stairs";

    public GrayHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
