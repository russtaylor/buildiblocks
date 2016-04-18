package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Silver Clay Tile Slab
 */
public class SilverClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "silver_clay_tile_slab";

    public SilverClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
