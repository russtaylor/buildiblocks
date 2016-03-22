package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * White Wool Slab
 */
public class WhiteWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "white_wool_slab";

    public WhiteWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
