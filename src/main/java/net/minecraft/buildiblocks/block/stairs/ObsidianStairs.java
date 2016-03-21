package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Obsidian Stairs.
 */
public class ObsidianStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "obsidian_stairs";

    public ObsidianStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
