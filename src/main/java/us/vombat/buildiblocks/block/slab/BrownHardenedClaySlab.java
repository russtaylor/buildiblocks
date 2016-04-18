package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Brown Stained Clay Slab
 */
public class BrownHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "brown_hardened_clay_slab";

    public BrownHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
