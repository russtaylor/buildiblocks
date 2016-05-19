package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Purple Clay Tile Slab
 */
public class PurpleClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "purple_clay_tile_slab";

    public PurpleClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
