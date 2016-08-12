package us.vombat.buildiblocks.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.Random;

/**
 * Handles the double slabs.
 */
public class ModBlockDoubleSlab extends ModBlockSingleSlab {

    private ModBlockSingleSlab singleSlabBlock;

    public ModBlockDoubleSlab(ModBlockSingleSlab singleSlabBlock, String blockName) {
        super(singleSlabBlock, blockName + "_double");
        this.singleSlabBlock = singleSlabBlock;
        setCreativeTab(null);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int unknown) {
        return Item.getItemFromBlock(singleSlabBlock);
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    @Override
    @Nonnull
    @SuppressWarnings("deprecation")
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return getStateFromMeta(meta);
    }
}
