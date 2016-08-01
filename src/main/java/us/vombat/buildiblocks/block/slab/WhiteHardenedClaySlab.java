package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * White Hardened Clay Slab
 */
public class WhiteHardenedClaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "white_hardened_clay_slab";

    public WhiteHardenedClaySlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
