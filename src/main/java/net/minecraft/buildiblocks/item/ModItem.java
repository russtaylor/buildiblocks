package net.minecraft.buildiblocks.item;

import net.minecraft.buildiblocks.common.ModBlockHelper;
import net.minecraft.buildiblocks.common.ModItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * A parent class for all normal Items in the mod.
 *
 * Created by russt on 12/21/14.
 */
public class ModItem extends Item implements IModItem {

    String itemName;

    public ModItem(String itemName) {
        super();
        this.itemName = itemName;
        setUnlocalizedName(itemName);
        setCreativeTab(CreativeTabs.tabMaterials);
    }

    public String getItemName() {
        return itemName;
    }

    public ModItem register(String itemName) {
        ItemList.itemList.add(this);
        GameRegistry.registerItem(this, itemName);
        ModItemHelper.registerItemRender(this, this.getItemName());
        return this;
    }
}
