package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Green Stained Clay Slab
 */
public class GreenHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "green_hardened_clay_slab";

    public GreenHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
