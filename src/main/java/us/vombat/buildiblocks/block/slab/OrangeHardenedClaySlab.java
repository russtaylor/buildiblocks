package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Orange Stained Clay Slab
 */
public class OrangeHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "orange_hardened_clay_slab";

    public OrangeHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
