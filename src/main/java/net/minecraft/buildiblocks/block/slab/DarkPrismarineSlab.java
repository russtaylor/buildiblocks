package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Dark Prismarine slabs.
 */
public class DarkPrismarineSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "dark_prismarine_slab";

    public DarkPrismarineSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
