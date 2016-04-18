package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Emerald Slab
 */
public class EmeraldSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "emerald_slab";

    public EmeraldSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
