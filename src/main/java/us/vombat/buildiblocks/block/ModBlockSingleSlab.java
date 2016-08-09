package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import static us.vombat.buildiblocks.block.ModBlockSlab.HALF_META_BIT;

/**
 * Parent class for all the slabs in the mod.
 */
public class ModBlockSingleSlab extends BlockSlab implements IModBlock {

    private String blockName;

    @SuppressWarnings("deprecation")
    public ModBlockSingleSlab(Block block, String blockName, float blockHardness, float blockResistance) {
        super(block.getMaterial(null));
        this.blockName = blockName;
        setSoundType(block.getSoundType());
        setHardness(blockHardness);
        setResistance(blockResistance);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setUnlocalizedName(blockName);
        setRegistryName(blockName);
        this.useNeighborBrightness = true;
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return getUnlocalizedName();
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return ModBlockSlab.VARIANT_PROPERTY;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return null;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP) {
            return HALF_META_BIT;
        }
        return 0;
    }

    @Override
    public String getBlockName() {
        return blockName;
    }

    @Override
    protected final BlockStateContainer createBlockState() {
        if (this.isDouble()) {
            return new BlockStateContainer(this, ModBlockSlab.VARIANT_PROPERTY);
        } else {
            return new BlockStateContainer(this, HALF, ModBlockSlab.VARIANT_PROPERTY);
        }
    }
}
