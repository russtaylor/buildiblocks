package us.vombat.buildiblocks.block;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

/**
* Handles the double slabs.
*/
public class ModBlockDoubleSlab extends ModBlockSingleSlab {

    private ModBlockSingleSlab singleSlabBlock;

    ModBlockDoubleSlab(ModBlockSingleSlab singleSlabBlock, String blockName,
                              float blockHardness, float blockResistance) {
        super(singleSlabBlock, blockName + "_double", blockHardness, blockResistance);
        this.singleSlabBlock = singleSlabBlock;
        setCreativeTab(null);
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random par2random, int par3) {
        return Item.getItemFromBlock(singleSlabBlock);
    }
}
