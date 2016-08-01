package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Lime Stained Clay Slab
 */
public class LimeHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "lime_hardened_clay_slab";

    public LimeHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
