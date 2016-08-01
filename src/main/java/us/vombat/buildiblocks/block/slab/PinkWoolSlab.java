package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Pink Wool Slab
 */
public class PinkWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "pink_wool_slab";

    public PinkWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
