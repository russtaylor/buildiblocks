package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Pink Clay Tile Stairs
 */
public class PinkClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "pink_clay_tile_stairs";

    public PinkClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
