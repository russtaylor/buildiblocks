package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

/**
 * The parent class for all normal Blocks in this mod.
 */
public class ModBlock extends Block implements IModBlock {

    private String blockName;

    public ModBlock(Block block, String blockName) {
        super(block.getDefaultState().getMaterial());
        this.blockName = blockName;
        this.setResistance(block.getExplosionResistance(null));
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setSoundType(block.getSoundType());
        this.setUnlocalizedName(blockName);
        this.setRegistryName(blockName);
    }

    public String getBlockName() {
        return blockName;
    }

    public ModBlock register() {
        BlockList.blockList.add(this);
        return this;
    }
}
