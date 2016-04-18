package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Cyan Wool Slab
 */
public class CyanWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "cyan_wool_slab";

    public CyanWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
