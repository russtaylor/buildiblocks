package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Blue Wool Slab
 */
public class BlueWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "blue_wool_slab";

    public BlueWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
