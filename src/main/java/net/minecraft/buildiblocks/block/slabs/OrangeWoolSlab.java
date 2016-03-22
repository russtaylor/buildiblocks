package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Orange Wool Slab
 */
public class OrangeWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "orange_wool_slab";
    public static final float BLOCK_HARDNESS = 0.8F;
    public static final float BLOCK_RESISTANCE = 4F;

    public OrangeWoolSlab(Block block) {
        super(BLOCK_NAME, block, BLOCK_HARDNESS, BLOCK_RESISTANCE);
    }

}
