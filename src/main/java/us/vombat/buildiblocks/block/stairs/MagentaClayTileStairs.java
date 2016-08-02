package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Magenta Clay Tile Stairs
 */
public class MagentaClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "magenta_clay_tile_stairs";

    public MagentaClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
