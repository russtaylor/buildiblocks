package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Light_blue Stained Clay Slab
 */
public class Light_blueHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "light_blue_hardened_clay_slab";

    public Light_blueHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
