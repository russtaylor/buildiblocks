package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * White Clay Tile Stairs
 */
public class WhiteClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "white_clay_tile_stairs";

    public WhiteClayTileStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }
}
