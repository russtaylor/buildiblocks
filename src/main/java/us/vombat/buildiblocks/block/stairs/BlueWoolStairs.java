package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Blue Wool Stairs.
 */
public class BlueWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "blue_wool_stairs";

    public BlueWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
