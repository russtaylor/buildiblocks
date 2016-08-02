package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Mossy Cobblestone Stairs.
 */
public class MossyCobblestoneStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "mossy_cobblestone_stairs";

    public MossyCobblestoneStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
