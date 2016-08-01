package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Green Clay Tile Slab
 */
public class GreenClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "green_clay_tile_slab";

    public GreenClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
