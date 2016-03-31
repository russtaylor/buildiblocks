package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Purple Wool Slab
 */
public class PurpleWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "purple_wool_slab";

    public PurpleWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
