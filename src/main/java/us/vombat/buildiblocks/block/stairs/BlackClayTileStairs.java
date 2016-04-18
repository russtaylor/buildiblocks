package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Black Clay Tile Stairs
 */
public class BlackClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "black_clay_tile_stairs";

    public BlackClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
