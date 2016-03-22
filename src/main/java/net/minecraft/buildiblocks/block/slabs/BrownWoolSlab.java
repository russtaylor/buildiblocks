package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Brown Wool Slab
 */
public class BrownWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "brown_wool_slab";

    public BrownWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
