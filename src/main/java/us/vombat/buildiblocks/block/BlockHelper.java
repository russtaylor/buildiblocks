package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Handles functionality that is common to more than one block type.
 */
class BlockHelper {
    static IModBlock registerBlockAndItem(IModBlock modBlock, Block block) {
        BlockList.blockList.add(modBlock);
        GameRegistry.register(block);
        // Register the related item
        ItemBlock itemBlock = new ItemBlock(block);
        GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
        return modBlock;
    }
}
