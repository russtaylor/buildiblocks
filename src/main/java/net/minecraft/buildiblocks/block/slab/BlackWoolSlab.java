package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Black Wool Slab
 */
public class BlackWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "black_wool_slab";

    public BlackWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
