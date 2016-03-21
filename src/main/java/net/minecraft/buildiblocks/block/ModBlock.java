package net.minecraft.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.buildiblocks.common.ModBlockHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * The parent class for all normal Blocks in this mod.
 */
public class ModBlock extends Block implements IModBlock {

    private String blockName;

    public ModBlock(Block block, String blockName) {
        super(block.getMaterial());
        this.blockName = blockName;
        this.setHardness(block.getBlockHardness(null, null));
        this.setResistance(block.getExplosionResistance(null));
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(block.stepSound);
        this.setUnlocalizedName(blockName);
        this.setRegistryName(blockName);
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.SOLID;
    }

    public String getBlockName() {
        return blockName;
    }

    public ModBlock register() {
        GameRegistry.registerBlock(this);
        BlockList.blockList.add(this);
        ModBlockHelper.registerItemRender(this, this.getBlockName());
        return this;
    }
}
