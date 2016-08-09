package us.vombat.buildiblocks.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

/**
 * Item for the mod's slabs.
 */
public class ModItemSlab extends ItemSlab {
    public ModItemSlab(Block block, BlockSlab singleSlab, BlockSlab doubleSlab) {
        super(block, singleSlab, doubleSlab);
    }
}
