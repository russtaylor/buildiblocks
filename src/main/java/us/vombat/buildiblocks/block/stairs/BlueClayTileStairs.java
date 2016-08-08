package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Blue Clay Tile Stairs
 */
public class BlueClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "blue_clay_tile_stairs";

    public BlueClayTileStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
