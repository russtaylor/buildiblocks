package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Mossy Stone Brick Slab
 */
public class MossyStoneBrickSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "mossy_stone_brick_slab";
    public static final float BLOCK_HARDNESS = 1.5F;
    public static final float BLOCK_RESISTANCE = 10.0F;

    public MossyStoneBrickSlab(Block block) {
        super(BLOCK_NAME, block, BLOCK_HARDNESS, BLOCK_RESISTANCE);
    }

}
