package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Magenta Clay Tile Stairs
 */
public class MagentaClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "magenta_clay_tile_stairs";

    public MagentaClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
