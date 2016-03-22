package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Silver Wool Slab
 */
public class SilverWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "silver_wool_slab";

    public SilverWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
