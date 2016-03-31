package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Purple Stained Clay Slab
 */
public class PurpleHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "purple_hardened_clay_slab";

    public PurpleHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
