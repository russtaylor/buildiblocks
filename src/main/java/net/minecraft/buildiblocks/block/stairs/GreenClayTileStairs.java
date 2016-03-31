package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Green Clay Tile Stairs
 */
public class GreenClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "green_clay_tile_stairs";

    public GreenClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
