package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Cyan Stained Clay Stairs.
 */
public class CyanHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "cyan_hardened_clay_stairs";

    public CyanHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
