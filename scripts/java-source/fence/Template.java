package net.minecraft.buildiblocks.block.fence;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockFence;

/**
 * Class Name Fence
 */
public class ClassNameFence extends ModBlockFence {
    public static final String BLOCK_NAME = "class_name_fence";

    public ClassNameFence(Block block) {
        super(block, BLOCK_NAME);
    }

    public ModBlockFence register() {
        return register(BLOCK_NAME);
    }
}
