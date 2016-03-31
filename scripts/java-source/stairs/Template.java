package net.minecraft.buildiblocks.block.stairs;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockStairs;

/**
 * Class Name Stairs
 */
public class ClassNameStairs extends ModBlockStairs {

    public static String BLOCK_NAME = "class_name_stairs";

    public ClassNameStairs(Block parent) {
        super(parent, parent.getDefaultState(), BLOCK_NAME);
    }

    public ModBlockStairs register() {
        return register(BLOCK_NAME);
    }
}
