package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Green Clay Tile Stairs
 */
public class GreenClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "green_clay_tile_stairs";

    public GreenClayTileStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
