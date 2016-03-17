package net.minecraft.buildiblocks.common;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.BuildiblocksMod;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Handles common functionality that blocks require.
 */
public class ModBlockHelper {
    public static void registerItemRender(Block block, String blockName) {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(BuildiblocksMod.MOD_ID + ":" + blockName, "inventory"));
    }
}
