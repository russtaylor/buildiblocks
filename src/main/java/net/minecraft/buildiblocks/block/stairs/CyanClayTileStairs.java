package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Cyan Clay Tile Stairs
 */
public class CyanClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "cyan_clay_tile_stairs";

    public CyanClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
