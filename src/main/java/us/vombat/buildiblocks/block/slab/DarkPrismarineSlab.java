package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Dark Prismarine slabs.
 */
public class DarkPrismarineSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "dark_prismarine_slab";

    public DarkPrismarineSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
