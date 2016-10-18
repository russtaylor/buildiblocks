package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * Parent class for the mod's Slabs
 */
public abstract class ModBlockSlab extends BlockSlab {

    static final PropertyBool VARIANT_PROPERTY = PropertyBool.create("variant");
    private static final int HALF_META_BIT = 8;

    @SuppressWarnings("deprecation")
    public ModBlockSlab(String singleSlabName, Block block) {
        super(block.getMaterial(null));
        setSoundType(block.getSoundType());
        setHardness(block.getBlockHardness(null, null, null));
        setResistance(block.getExplosionResistance(null));
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setUnlocalizedName(singleSlabName);
        setRegistryName(singleSlabName);
    }

    @Override
    @Nonnull
    public String getUnlocalizedName(int meta) {
        return getUnlocalizedName();
    }

    @Override
    @Nonnull
    public IProperty<?> getVariantProperty() {
        return VARIANT_PROPERTY;
    }

    @Override
    @Nonnull
    public Comparable<?> getTypeForItem(@Nonnull ItemStack stack) {
        return false;
    }

    @Override
    @Nonnull
    protected final BlockStateContainer createBlockState() {
        if (this.isDouble()) {
            return new BlockStateContainer(this, VARIANT_PROPERTY);
        } else {
            return new BlockStateContainer(this, HALF, VARIANT_PROPERTY);
        }
    }

    @Override
    @SuppressWarnings("deprecation")
    @Nonnull
    public final IBlockState getStateFromMeta(final int meta) {
        IBlockState blockState = getDefaultState();
        blockState = blockState.withProperty(VARIANT_PROPERTY, false);
        if (!isDouble()) {
            EnumBlockHalf value = EnumBlockHalf.BOTTOM;
            if ((meta & HALF_META_BIT) != 0)
                value = EnumBlockHalf.TOP;

            blockState = blockState.withProperty(HALF, value);
        }

        return blockState;
    }

    @Override
    public final int getMetaFromState(final IBlockState state) {
        if (isDouble())
            return 0;

        if (state.getValue(HALF) == EnumBlockHalf.TOP)
            return HALF_META_BIT;
        else
            return 0;
    }
}
