package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Light Blue Wool Slab
 */
public class LightBlueWoolSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "light_blue_wool_slab";

    public LightBlueWoolSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
