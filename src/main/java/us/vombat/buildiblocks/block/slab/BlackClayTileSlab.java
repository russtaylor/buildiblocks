package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Black Clay Tile Slab
 */
public class BlackClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "black_clay_tile_slab";

    public BlackClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
