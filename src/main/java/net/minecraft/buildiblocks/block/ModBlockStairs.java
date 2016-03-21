package net.minecraft.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.buildiblocks.common.ModBlockHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * A parent class for BlockStairs in the mod.
 */
public class ModBlockStairs extends BlockStairs implements IModBlock {

    private String blockName;

    public ModBlockStairs(Block block, IBlockState blockState, String blockName) {
        super(blockState);
        this.blockName = blockName;
        setUnlocalizedName(blockName);
        setRegistryName(blockName);
        setCreativeTab(CreativeTabs.tabBlock);
        useNeighborBrightness = true;
    }

    @Override
    public String getBlockName() {
        return blockName;
    }

    public ModBlockStairs register(String blockName) {
        GameRegistry.registerBlock(this, blockName);
        BlockList.blockList.add(this);
        ModBlockHelper.registerItemRender(this, this.getBlockName());
        return this;
    }
}
