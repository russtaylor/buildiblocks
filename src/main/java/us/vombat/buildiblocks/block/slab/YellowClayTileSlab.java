package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Yellow Clay Tile Slab
 */
public class YellowClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "yellow_clay_tile_slab";

    public YellowClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null), block.getExplosionResistance(null));
    }

}
