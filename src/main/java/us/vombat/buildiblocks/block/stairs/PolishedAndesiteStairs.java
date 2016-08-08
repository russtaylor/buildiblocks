package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Iron Stairs.
 *
 * Created by russt on 12/2/14.
 */
public class PolishedAndesiteStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "polished_andesite_stairs";

    public PolishedAndesiteStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
