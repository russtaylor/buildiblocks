package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Pink Clay Tile Slab
 */
public class PinkClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "pink_clay_tile_slab";

    public PinkClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
