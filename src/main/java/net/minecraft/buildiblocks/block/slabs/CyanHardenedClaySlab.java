package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Cyan Stained Clay Slab
 */
public class CyanHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "cyan_hardened_clay_slab";

    public CyanHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
