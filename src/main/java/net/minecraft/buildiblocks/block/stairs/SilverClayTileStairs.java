package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Silver Clay Tile Stairs
 */
public class SilverClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "silver_clay_tile_stairs";

    public SilverClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
