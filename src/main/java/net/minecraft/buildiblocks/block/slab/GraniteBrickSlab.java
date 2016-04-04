package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Granite Brick Slab
 */
public class GraniteBrickSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "granite_brick_slab";

    public GraniteBrickSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
