package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Emerald Stairs
 */
public class EmeraldStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "emerald_stairs";

    public EmeraldStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
