package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Brown Stained Clay Slab
 */
public class BrownHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "brown_hardened_clay_slab";

    public BrownHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
