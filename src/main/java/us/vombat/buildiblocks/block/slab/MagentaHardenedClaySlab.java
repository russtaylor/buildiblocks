package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Magenta Stained Clay Slab
 */
public class MagentaHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "magenta_hardened_clay_slab";

    public MagentaHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
