package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Orange Stained Clay Stairs.
 */
public class OrangeHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "orange_hardened_clay_stairs";

    public OrangeHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
