package us.vombat.buildiblocks.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import us.vombat.buildiblocks.BuildiblocksMod;
import us.vombat.buildiblocks.CommonProxy;
import us.vombat.buildiblocks.block.BlockList;
import us.vombat.buildiblocks.block.IModBlock;
import us.vombat.buildiblocks.item.IModItem;
import us.vombat.buildiblocks.item.ItemList;

/**
 * A proxy to handle registering the renderers for the blocks we have.
 */
@SuppressWarnings("unused")
public class ClientProxy extends CommonProxy {

    public void preInit() {
        for (IModBlock block : BlockList.blockList) {
            ResourceLocation resourceLocation = new ResourceLocation(BuildiblocksMod.MOD_ID, block.getBlockName());
            Item item = Item.REGISTRY.getObject(resourceLocation);
            registerBlockRenderer(item, BuildiblocksMod.MOD_ID + ":" + block.getBlockName());
        }

        for (IModItem item : ItemList.itemList) {
            ResourceLocation resourceLocation = new ResourceLocation(BuildiblocksMod.MOD_ID, item.getItemName());
            Item gameItem = Item.REGISTRY.getObject(resourceLocation);
            registerBlockRenderer(gameItem, BuildiblocksMod.MOD_ID + ":" + item.getItemName());
        }
    }

    private void registerBlockRenderer(Item item, int metadata, String itemName) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(itemName, "inventory"));
    }

    private void registerBlockRenderer(Item item, String itemName) {
        registerBlockRenderer(item, 0, itemName);
    }
}
