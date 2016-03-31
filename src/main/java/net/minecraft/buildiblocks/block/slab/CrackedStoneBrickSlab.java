package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Cracked Stone Brick Slab
 */
public class CrackedStoneBrickSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "cracked_stone_brick_slab";
    public static final float BLOCK_HARDNESS = 1.5F;
    public static final float BLOCK_RESISTANCE = 30F;

    public CrackedStoneBrickSlab(Block block) {
        super(BLOCK_NAME, block, BLOCK_HARDNESS, BLOCK_RESISTANCE);
    }

}
