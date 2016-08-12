package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Parent class for all the slabs in the mod.
 */
public class ModBlockSingleSlab extends ModBlockSlab implements IModBlock {

    private String blockName;

    @SuppressWarnings("deprecation")
    public ModBlockSingleSlab(Block block, String blockName) {
        super(blockName, block);
        this.blockName = blockName;
        this.useNeighborBrightness = true;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int unknown) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public String getBlockName() {
        return blockName;
    }
}
