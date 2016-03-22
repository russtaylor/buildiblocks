package net.minecraft.buildiblocks.block.slabs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockSlab;

/**
 * Yellow Wool Slab
 */
public class YellowWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "yellow_wool_slab";

    public YellowWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
