package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Orange Clay Tile Stairs
 */
public class OrangeClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "orange_clay_tile_stairs";

    public OrangeClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
