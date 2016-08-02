package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Clay Tile Stairs.
 */
public class ClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "clay_tile_stairs";

    public ClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
