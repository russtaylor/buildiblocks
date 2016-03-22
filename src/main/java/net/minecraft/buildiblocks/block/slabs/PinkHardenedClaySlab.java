package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Pink Stained Clay Slab
 */
public class PinkHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "pink_hardened_clay_slab";

    public PinkHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
