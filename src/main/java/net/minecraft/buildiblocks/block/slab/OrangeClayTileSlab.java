package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Orange Clay Tile Slab
 */
public class OrangeClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "orange_clay_tile_slab";

    public OrangeClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
