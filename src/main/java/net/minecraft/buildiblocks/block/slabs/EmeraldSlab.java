package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Emerald Slab
 */
public class EmeraldSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "emerald_slab";
    public static final float BLOCK_HARDNESS = 5F;
    public static final float BLOCK_RESISTANCE = 30F;

    public EmeraldSlab(Block block) {
        super(BLOCK_NAME, block, BLOCK_HARDNESS, BLOCK_RESISTANCE);
    }

}
