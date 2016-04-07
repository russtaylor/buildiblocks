package net.minecraft.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * The parent class for all normal Blocks in this mod.
 */
public class ModBlockTorch extends Block implements IModBlock {

    private String blockName;

    public ModBlockTorch(Block block, String blockName) {
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

    public ModBlockTorch register() {
        GameRegistry.registerBlock(this);
        BlockList.blockList.add(this);
        return this;
    }
}
