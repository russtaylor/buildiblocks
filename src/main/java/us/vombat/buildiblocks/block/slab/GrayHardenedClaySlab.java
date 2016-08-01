package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Gray Stained Clay Slab
 */
public class GrayHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "gray_hardened_clay_slab";

    public GrayHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
