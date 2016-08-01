package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Blue Wool Slab
 */
public class BlueWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "blue_wool_slab";

    public BlueWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
