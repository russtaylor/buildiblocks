package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Parent class for all walls.
 */
public class ModBlockWall extends BlockWall implements IModBlock {

    private String blockName;

    public ModBlockWall(Block block, String blockName) {
        super(block);
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

    public ModBlockWall register() {
        return (ModBlockWall) BlockHelper.registerBlockAndItem(this, this);
    }

}
