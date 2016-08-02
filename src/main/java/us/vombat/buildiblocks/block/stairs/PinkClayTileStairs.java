package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Pink Clay Tile Stairs
 */
public class PinkClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "pink_clay_tile_stairs";

    public PinkClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
