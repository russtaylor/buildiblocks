package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Silver Clay Tile Stairs
 */
public class SilverClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "silver_clay_tile_stairs";

    public SilverClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
