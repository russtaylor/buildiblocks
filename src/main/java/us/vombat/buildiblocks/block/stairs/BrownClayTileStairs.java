package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Brown Clay Tile Stairs
 */
public class BrownClayTileStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "brown_clay_tile_stairs";

    public BrownClayTileStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
