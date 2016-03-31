package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Blue Clay Tile Slab
 */
public class BlueClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "blue_clay_tile_slab";

    public BlueClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
