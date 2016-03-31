package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Obsidian slabs.
 */
public class ObsidianSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "obsidian_slab";

    public ObsidianSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
