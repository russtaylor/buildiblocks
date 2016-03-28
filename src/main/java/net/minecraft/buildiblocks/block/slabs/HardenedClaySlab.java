package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Hardened Clay slabs.
 */
public class HardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "hardened_clay_slab";

    public HardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
