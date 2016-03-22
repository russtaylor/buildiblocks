package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Orange Wool Stairs.
 */
public class OrangeWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "orange_wool_stairs";

    public OrangeWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
