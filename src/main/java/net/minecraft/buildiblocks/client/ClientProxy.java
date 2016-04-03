package net.minecraft.buildiblocks.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.buildiblocks.CommonProxy;
import net.minecraft.buildiblocks.BuildiblocksMod;
import net.minecraft.buildiblocks.block.BlockList;
import net.minecraft.buildiblocks.block.IModBlock;
import net.minecraft.buildiblocks.item.IModItem;
import net.minecraft.buildiblocks.item.ItemList;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * A proxy to handle registering the renderers for the blocks we have.
 */
@SuppressWarnings("unused")
public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderers() {
        for (IModBlock block : BlockList.blockList) {
            Item item = GameRegistry.findItem(BuildiblocksMod.MOD_ID, block.getBlockName());
            registerBlockRenderer(item, BuildiblocksMod.MOD_ID + ":" + block.getBlockName());
        }

        for (IModItem item : ItemList.itemList) {
            Item gameItem = GameRegistry.findItem(BuildiblocksMod.MOD_ID, item.getItemName());
            registerBlockRenderer(gameItem, BuildiblocksMod.MOD_ID + ":" + item.getItemName());
        }
    }

    private void registerBlockRenderer(Item item, int metadata, String itemName) {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(item, metadata, new ModelResourceLocation(itemName, "inventory"));
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(BuildiblocksMod.MOD_ID + ":" + itemName, "inventory"));
    }

    private void registerBlockRenderer(Item item, String itemName) {
        registerBlockRenderer(item, 0, itemName);
    }
}
