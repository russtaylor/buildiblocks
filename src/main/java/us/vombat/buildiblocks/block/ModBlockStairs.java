package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

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
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        useNeighborBrightness = true;
    }

    @Override
    public String getBlockName() {
        return blockName;
    }

    public ModBlockStairs register(String blockName) {
        BlockList.blockList.add(this);
        return this;
    }
}
