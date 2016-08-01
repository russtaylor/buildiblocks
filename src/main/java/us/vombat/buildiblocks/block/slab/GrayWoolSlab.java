package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Gray Wool Slab
 */
public class GrayWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "gray_wool_slab";

    public GrayWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
