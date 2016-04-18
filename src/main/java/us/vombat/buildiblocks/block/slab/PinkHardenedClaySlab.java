package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Pink Stained Clay Slab
 */
public class PinkHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "pink_hardened_clay_slab";

    public PinkHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
