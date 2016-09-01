package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * White Glass Stairs
 */
public class WhiteGlassStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "white_glass_stairs";

    public WhiteGlassStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }
}
