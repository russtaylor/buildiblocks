package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Silver Stained Clay Slab
 */
public class SilverHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "silver_hardened_clay_slab";

    public SilverHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
