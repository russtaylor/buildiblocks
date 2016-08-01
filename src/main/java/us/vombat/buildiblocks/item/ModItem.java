package us.vombat.buildiblocks.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * A parent class for all normal Items in the mod.
 * <p>
 * Created by russt on 12/21/14.
 */
public class ModItem extends Item implements IModItem {

    private String itemName;

    public ModItem(String itemName) {
        super();
        this.itemName = itemName;
        setUnlocalizedName(itemName);
        setCreativeTab(CreativeTabs.MATERIALS);
    }

    public String getItemName() {
        return this.itemName;
    }

    public ModItem register(String itemName) {
        ItemList.itemList.add(this);
        GameRegistry.registerItem(this, itemName);
        return this;
    }
}
