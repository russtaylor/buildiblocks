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
 * Double slabs of a translucent variety.
 */
public class ModBlockTranslucentDoubleSlab extends ModBlockDoubleSlab {
    public ModBlockTranslucentDoubleSlab(ModBlockSingleSlab singleSlabBlock, String blockName) {
        super(singleSlabBlock, blockName);
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

        return !(neighborBlock instanceof ModBlockTranslucentDoubleSlab);

    }

    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }

    public ModBlockTranslucentDoubleSlab register() {
        return (ModBlockTranslucentDoubleSlab) BlockHelper.registerTranslucentStairs(this, this);
    }
}
