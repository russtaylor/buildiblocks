package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Magenta Wool Slab
 */
public class MagentaWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "magenta_wool_slab";

    public MagentaWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
