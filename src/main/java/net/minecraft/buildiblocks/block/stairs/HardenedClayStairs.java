package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Hardened Clay Stairs.
 */
public class HardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "hardened_clay_stairs";

    public HardenedClayStairs(BlockColored parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public MapColor getMapColor(IBlockState state)
    {
        return MapColor.adobeColor;
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
