package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Silver Stained Clay Stairs.
 */
public class SilverHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "silver_hardened_clay_stairs";

    public SilverHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
