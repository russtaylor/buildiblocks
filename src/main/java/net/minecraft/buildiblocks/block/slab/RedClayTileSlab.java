package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Red Clay Tile Slab
 */
public class RedClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "red_clay_tile_slab";

    public RedClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
