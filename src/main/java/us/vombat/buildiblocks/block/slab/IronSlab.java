package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModSlabContainer;

/**
 * Iron slabs.
 * <p>
 * Created by russt on 12/2/14.
 */
public class IronSlab extends ModSlabContainer {

    public static final String BLOCK_NAME = "iron_slab";

    @SuppressWarnings("deprecation")
    public IronSlab(Block block) {
        super(BLOCK_NAME, block);
    }

}
