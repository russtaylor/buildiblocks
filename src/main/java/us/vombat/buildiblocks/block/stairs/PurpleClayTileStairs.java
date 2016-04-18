package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Purple Clay Tile Stairs
 */
public class PurpleClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "purple_clay_tile_stairs";

    public PurpleClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
