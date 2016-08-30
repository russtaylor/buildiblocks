package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Parent class for all panes.
 */
public class ModBlockPane extends BlockPane implements IModBlock {

    private String blockName;

    public ModBlockPane(Block block, String blockName) {
        super(block.getMaterial(null), true);
        this.blockName = blockName;
        setUnlocalizedName(blockName);
        setRegistryName(blockName);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        useNeighborBrightness = true;
    }

    @Override
    public String getBlockName() {
        return blockName;
    }

    public ModBlockPane register() {
        return (ModBlockPane) BlockHelper.registerBlockAndItem(this, this);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
        list.add(new ItemStack(itemIn, 1, 0));
    }
}
