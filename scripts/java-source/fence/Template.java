package net.minecraft.buildiblocks.block.fences;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockFence;

/**
 * Class Name
 */
public class ClassName extends ModBlockFence {
    public static final String BLOCK_NAME = "class_name";

    public ClassName(Block block) {
        super(block, BLOCK_NAME);
    }

    public ModBlockFence register() {
        return register(BLOCK_NAME);
    }
}
