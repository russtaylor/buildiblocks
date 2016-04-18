package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Magenta Clay Tile Slab
 */
public class MagentaClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "magenta_clay_tile_slab";

    public MagentaClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
