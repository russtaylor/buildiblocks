package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Red Clay Tile Stairs
 */
public class RedClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "red_clay_tile_stairs";

    public RedClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
