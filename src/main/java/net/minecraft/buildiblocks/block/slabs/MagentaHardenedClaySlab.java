package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Magenta Stained Clay Slab
 */
public class MagentaHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "magenta_hardened_clay_slab";

    public MagentaHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
