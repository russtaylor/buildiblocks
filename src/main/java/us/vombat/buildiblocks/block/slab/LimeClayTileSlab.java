package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Lime Clay Tile Slab
 */
public class LimeClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "lime_clay_tile_slab";

    public LimeClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
