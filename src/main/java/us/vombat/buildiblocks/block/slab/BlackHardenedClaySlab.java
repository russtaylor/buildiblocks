package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Black Stained Clay Slab
 */
public class BlackHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "black_hardened_clay_slab";

    public BlackHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
