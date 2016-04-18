package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Red Stained Clay Slab
 */
public class RedHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "red_hardened_clay_slab";

    public RedHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
