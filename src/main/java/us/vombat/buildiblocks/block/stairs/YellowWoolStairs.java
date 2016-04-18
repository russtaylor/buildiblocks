package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Yellow Wool Stairs.
 */
public class YellowWoolStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "yellow_wool_stairs";

    public YellowWoolStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
