package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Diamond slabs.
 * <p>
 * Created by russt on 3/5/15.
 */
public class DiamondSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "diamond_slab";
    public static final float BLOCK_HARDNESS = 3.0F;
    public static final float BLOCK_RESISTANCE = 10.0F;

    @SuppressWarnings("deprecation")
    public DiamondSlab(Block block) {
        super(BLOCK_NAME, block, BLOCK_HARDNESS, BLOCK_RESISTANCE);
    }

}
