package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Diorite Brick Slab
 */
public class DioriteBrickSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "diorite_brick_slab";

    public DioriteBrickSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
