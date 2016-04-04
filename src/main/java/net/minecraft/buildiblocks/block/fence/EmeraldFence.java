package net.minecraft.buildiblocks.block.fence;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockFence;

/**
 * Emerald fences.
 */
public class EmeraldFence extends ModBlockFence {
    public static final String BLOCK_NAME = "emerald_fence";

    public EmeraldFence(Block block) {
        super(block, BLOCK_NAME);
    }

    public ModBlockFence register() {
        return register(BLOCK_NAME);
    }
}
