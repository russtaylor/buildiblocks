package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Parent class for all fences.
 */
public class ModBlockFence extends BlockFence implements IModBlock {

    private String blockName;

    public ModBlockFence(Block block, String blockName) {
        super(block.getMaterial(null), MapColor.BLACK);
        this.blockName = blockName;
        this.setHardness(block.getBlockHardness(null, null, null));
        this.setResistance(block.getExplosionResistance(null));
        this.setSoundType(block.getSoundType());
        setUnlocalizedName(blockName);
        setRegistryName(blockName);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        useNeighborBrightness = true;
    }

    @Override
    public String getBlockName() {
        return blockName;
    }

    public ModBlockFence register() {
        return (ModBlockFence) BlockHelper.registerBlockAndItem(this, this);
    }
}
