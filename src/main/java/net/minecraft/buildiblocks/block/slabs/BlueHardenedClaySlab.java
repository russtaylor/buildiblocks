package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Blue Stained Clay Slab
 */
public class BlueHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "blue_hardened_clay_slab";

    public BlueHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
