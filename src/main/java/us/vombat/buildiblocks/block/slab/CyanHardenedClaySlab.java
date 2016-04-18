package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Cyan Stained Clay Slab
 */
public class CyanHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "cyan_hardened_clay_slab";

    public CyanHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
