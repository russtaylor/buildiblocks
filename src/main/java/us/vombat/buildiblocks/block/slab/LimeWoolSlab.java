package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Lime Wool Slab
 */
public class LimeWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "lime_wool_slab";

    public LimeWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
