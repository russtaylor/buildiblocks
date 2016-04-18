package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Hay Slab
 */
public class HaySlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "hay_slab";
    public static final float BLOCK_HARDNESS = 0.5F;
    public static final float BLOCK_RESISTANCE = 2.5F;

    public HaySlab(Block block) {
        super(BLOCK_NAME, block, BLOCK_HARDNESS, BLOCK_RESISTANCE);
    }

}
