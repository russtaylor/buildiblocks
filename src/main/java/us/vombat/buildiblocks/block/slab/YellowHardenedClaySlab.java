package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Yellow Stained Clay Slab
 */
public class YellowHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "yellow_hardened_clay_slab";

    public YellowHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
