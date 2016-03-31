package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Red Wool Slab
 */
public class RedWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "red_wool_slab";

    public RedWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}