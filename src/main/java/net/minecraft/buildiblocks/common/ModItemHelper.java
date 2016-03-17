package net.minecraft.buildiblocks.common;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.BuildiblocksMod;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Handles common functionality that items require.
 */
public class ModItemHelper {
    public static void registerItemRender(Item item, String itemName) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(BuildiblocksMod.MOD_ID + ":" + itemName, "inventory"));
    }
}
