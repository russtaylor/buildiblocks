package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Andesite Brick Slab
 */
public class AndesiteBrickSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "andesite_brick_slab";

    public AndesiteBrickSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
