package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Green Wool Slab
 */
public class GreenWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "green_wool_slab";

    public GreenWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
