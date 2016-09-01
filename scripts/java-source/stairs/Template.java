package us.vombat.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockStairs;

/**
 * Class Name Stairs
 */
public class ClassNameStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "class_name_stairs";

    public ClassNameStairs(Block parent) {
        super(parent.getDefaultState(), BLOCK_NAME);
    }
}
