package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Dark Prismarine Stairs.
 */
public class DarkPrismarineStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "dark_prismarine_stairs";

    public DarkPrismarineStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
