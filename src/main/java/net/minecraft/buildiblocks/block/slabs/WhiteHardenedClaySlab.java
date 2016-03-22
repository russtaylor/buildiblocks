package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * White Hardened Clay Slab
 */
public class WhiteHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "white_hardened_clay_slab";

    public WhiteHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
