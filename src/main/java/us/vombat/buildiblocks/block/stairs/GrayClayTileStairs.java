package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Gray Clay Tile Stairs
 */
public class GrayClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "gray_clay_tile_stairs";

    public GrayClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
