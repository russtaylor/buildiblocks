package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Magenta Stained Clay Stairs.
 */
public class MagentaHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "magenta_hardened_clay_stairs";

    public MagentaHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
