package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Custom class for Lapis Lazuli Stairs.
 *
 * Created by russt on 12/18/14.
 */
public class LapisLazuliStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "lapis_lazuli_stairs";

    public LapisLazuliStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }

}
