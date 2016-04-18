package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Mossy Cobblestone slabs.
 */
public class MossyCobblestoneSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "mossy_cobblestone_slab";

    public MossyCobblestoneSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
