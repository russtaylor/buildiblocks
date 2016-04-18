package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Lime Clay Tile Stairs
 */
public class LimeClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "lime_clay_tile_stairs";

    public LimeClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
