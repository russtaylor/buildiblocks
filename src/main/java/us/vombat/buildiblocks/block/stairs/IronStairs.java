package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Iron Stairs.
 *
 * Created by russt on 12/2/14.
 */
public class IronStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "iron_stairs";

    public IronStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
