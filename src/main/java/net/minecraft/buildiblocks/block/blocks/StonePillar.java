package net.minecraft.buildiblocks.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.buildiblocks.block.ModBlock;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

/**
 * Class for Stone Pillar
 *
 * Created by russt on 12/29/14.
 */
public class StonePillar extends ModBlock {

    public static final String BLOCK_NAME = "stone_pillar";

    public StonePillar(Block block) {
        super(block, BLOCK_NAME);
    }

}
