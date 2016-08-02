package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Orange Stained Clay Stairs.
 */
public class OrangeHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "orange_hardened_clay_stairs";

    public OrangeHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
