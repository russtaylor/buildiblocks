package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Gray Clay Tile Slab
 */
public class GrayClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "gray_clay_tile_slab";

    public GrayClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
