package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Magenta Wool Stairs.
 */
public class MagentaWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "magenta_wool_stairs";

    public MagentaWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
