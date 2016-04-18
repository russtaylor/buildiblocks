package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Clay Tile slabs.
 */
public class ClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "clay_tile_slab";

    public ClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
