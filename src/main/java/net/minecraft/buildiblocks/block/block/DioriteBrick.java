package net.minecraft.buildiblocks.block.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.buildiblocks.block.ModBlock;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

/**
 * Diorite Brick
 */
public class DioriteBrick extends ModBlock {

    public static final String BLOCK_NAME = "diorite_brick";

    public DioriteBrick(Block block) {
        super(block, BLOCK_NAME);
    }

}
