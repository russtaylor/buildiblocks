package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Obsidian Stairs.
 */
public class ObsidianStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "obsidian_stairs";

    public ObsidianStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

}
