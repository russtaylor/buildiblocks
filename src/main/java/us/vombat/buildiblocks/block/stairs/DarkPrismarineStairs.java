package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Dark Prismarine Stairs.
 */
public class DarkPrismarineStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "dark_prismarine_stairs";

    public DarkPrismarineStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
