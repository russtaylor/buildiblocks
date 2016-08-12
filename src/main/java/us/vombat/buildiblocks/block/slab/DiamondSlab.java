package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModSlabContainer;

/**
 * Diamond slabs.
 * <p>
 * Created by russt on 3/5/15.
 */
public class DiamondSlab extends ModSlabContainer {

    public static final String BLOCK_NAME = "diamond_slab";

    @SuppressWarnings("deprecation")
    public DiamondSlab(Block block) {
        super(BLOCK_NAME, block);
    }

}
