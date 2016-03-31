package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Cyan Clay Tile Slab
 */
public class CyanClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "cyan_clay_tile_slab";

    public CyanClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
