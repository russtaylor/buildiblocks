package net.minecraft.buildiblocks.block.fence;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockFence;

/**
 * Iron fences.
 *
 * Created by russt on 12/2/14.
 */
public class IronFence extends ModBlockFence {
    public static final String BLOCK_NAME = "iron_fence";

    public IronFence(Block block) {
        super(block, BLOCK_NAME);
    }

    public ModBlockFence register() {
        return register(BLOCK_NAME);
    }
}
