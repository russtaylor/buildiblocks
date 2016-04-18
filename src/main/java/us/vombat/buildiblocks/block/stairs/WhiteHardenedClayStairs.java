package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for White Hardened Clay Stairs.
 */
public class WhiteHardenedClayStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "white_hardened_clay_stairs";

    public WhiteHardenedClayStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
