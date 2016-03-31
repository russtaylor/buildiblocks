package net.minecraft.buildiblocks.block.fence;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockFence;

/**
 * Gold fences.
 *
 * Created by russt on 12/2/14.
 */
public class GoldFence extends ModBlockFence {
    public static final String BLOCK_NAME = "gold_fence";

    public GoldFence(Block block) {
        super(block, BLOCK_NAME);
    }

    public ModBlockFence register() {
        return register(BLOCK_NAME);
    }
}
