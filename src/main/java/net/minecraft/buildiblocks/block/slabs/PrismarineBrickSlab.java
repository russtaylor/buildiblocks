package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Prismarine Brick slabs.
 */
public class PrismarineBrickSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "prismarine_brick_slab";

    public PrismarineBrickSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
