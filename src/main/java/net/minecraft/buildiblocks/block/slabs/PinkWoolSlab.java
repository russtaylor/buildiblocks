package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Pink Wool Slab
 */
public class PinkWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "pink_wool_slab";

    public PinkWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
