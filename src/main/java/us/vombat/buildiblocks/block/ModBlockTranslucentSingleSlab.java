package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

/**
 * Single Slabs of a Translucent Variety
 */
public class ModBlockTranslucentSingleSlab extends ModBlockSingleSlab {
    public ModBlockTranslucentSingleSlab(Block block, String blockName) {
        super(block, blockName);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Nonnull
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        IBlockState neighborBlockState = blockAccess.getBlockState(pos.offset(side));
        Block neighborBlock = neighborBlockState.getBlock();

        return !(neighborBlock instanceof ModBlockTranslucentSingleSlab
                && neighborBlockState.getValue(HALF) == blockState.getValue(HALF));

    }

    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }

    public ModBlockTranslucentSingleSlab register() {
        return (ModBlockTranslucentSingleSlab) BlockHelper.registerTranslucentStairs(this, this);
    }
}
