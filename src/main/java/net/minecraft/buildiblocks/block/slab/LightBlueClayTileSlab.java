package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Light Blue Clay Tile Slab
 */
public class LightBlueClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "light_blue_clay_tile_slab";

    public LightBlueClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
