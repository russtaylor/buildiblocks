package net.minecraft.buildiblocks.block.slab;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Class Name Slab
 */
public class ClassNameSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "class_name_slab";

    public ClassNameSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
