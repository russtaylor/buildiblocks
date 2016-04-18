package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * Handles functionality that is common to more than one block type.
 */
class BlockHelper {
    /**
     * Calculates the directions that the wall should face, based on the materials/blocks in each
     * adjacent block location.
     *
     * @param blockAccess block access
     * @param blockPos the specified position
     * @return Whether or not the wall should point toward the specified block.
     */
    static boolean calculateWallDirection(IBlockAccess blockAccess, BlockPos blockPos, Block instance) {
        Block block = blockAccess.getBlockState(blockPos).getBlock();
        if (block != instance) {
            if (block != Blocks.barrier) {
                if (block.getMaterial().isOpaque()) {
                    if (block.isFullCube()) {
                        return Material.gourd != block.getMaterial();
                    }
                }
            }
            return false;
        } else {
            return block != Blocks.barrier;
        }
    }
}
