package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Obsidian slabs.
 */
public class ObsidianSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "obsidian_slab";
    public static final float BLOCK_HARDNESS = 50F;
    public static final float BLOCK_RESISTANCE = 6000F;

    public ObsidianSlab(Block block) {
        super(BLOCK_NAME, block, BLOCK_HARDNESS, BLOCK_RESISTANCE);
    }

}
