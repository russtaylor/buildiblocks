package us.vombat.buildiblocks.block.slab;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockSlab;

/**
 * Cyan Clay Tile Slab
 */
public class CyanClayTileSlab extends ModBlockSlab {

    public static final String BLOCK_NAME = "cyan_clay_tile_slab";

    public CyanClayTileSlab(Block block) {
        super(BLOCK_NAME, block, block.getBlockHardness(null, null, null), block.getExplosionResistance(null));
    }

}
