package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Silver Wool Stairs.
 */
public class SilverWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "silver_wool_stairs";

    public SilverWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
