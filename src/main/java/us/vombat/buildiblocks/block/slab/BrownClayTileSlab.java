package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Brown Clay Tile Slab
 */
public class BrownClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "brown_clay_tile_slab";

    public BrownClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
