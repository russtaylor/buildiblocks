package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Yellow Clay Tile Stairs
 */
public class YellowClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "yellow_clay_tile_stairs";

    public YellowClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
