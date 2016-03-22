package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Green Stained Clay Slab
 */
public class GreenHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "green_hardened_clay_slab";

    public GreenHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
