package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.vombat.buildiblocks.item.ModItemSlab;

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

    static IModBlock registerTranslucentStairs(IModBlock modBlock, Block block) {
        BlockList.blockList.add(modBlock);
        GameRegistry.register(block);
        ModelLoader.setCustomStateMapper(block,
                new StateMap.Builder().ignore(new IProperty[]{ModBlockSlab.VARIANT_PROPERTY}).build());
        // Register the related item
        ItemBlock itemBlock = new ItemBlock(block);
        GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
        return modBlock;
    }

    static void registerSlabAndItem(ModSlabContainer slab) {
        // Register the single slab
        BlockList.blockList.add(slab.getSingleSlab());
        GameRegistry.register(slab.getSingleSlab());
        ModelLoader.setCustomStateMapper(slab.getSingleSlab(),
                new StateMap.Builder().ignore(new IProperty[]{ModBlockSlab.VARIANT_PROPERTY}).build());
        // Register the double slab
        BlockList.blockList.add(slab.getDoubleSlab());
        GameRegistry.register(slab.getDoubleSlab());
        ModelLoader.setCustomStateMapper(slab.getDoubleSlab(),
                new StateMap.Builder().ignore(new IProperty[]{ModBlockSlab.VARIANT_PROPERTY}).build());
        // Register the item
        ModItemSlab itemSlab = new ModItemSlab(slab.getSingleSlab(), slab.getSingleSlab(), slab.getDoubleSlab());
        itemSlab.setRegistryName(slab.getSingleSlab().getRegistryName());
        GameRegistry.register(itemSlab);
    }
}
