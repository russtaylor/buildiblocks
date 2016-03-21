package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Obsidian slabs.
 */
public class ObsidianSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "obsidian_slab";
    public static final float BLOCK_HARDNESS = 0.5F;
    public static final float BLOCK_RESISTANCE = 10.0F;

    public ObsidianSlab(Block block) {
        super(BLOCK_NAME, block, BLOCK_HARDNESS, BLOCK_RESISTANCE);
    }

}
