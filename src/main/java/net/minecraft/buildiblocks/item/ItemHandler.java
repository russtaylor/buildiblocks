package net.minecraft.buildiblocks.item;

import net.minecraft.buildiblocks.item.rod.DiamondRod;
import net.minecraft.buildiblocks.item.rod.GoldRod;
import net.minecraft.buildiblocks.item.rod.IronRod;

/**
 * Handles the creation of our mod's Items.
 *
 * Created by russt on 12/22/14.
 */
public class ItemHandler {
    public ItemList itemList;

    public ItemHandler() {
        this.itemList = new ItemList();
    }

    public void registerItems() {
        registerRods();
    }

    private void registerRods() {
        ItemList.ironRod = new IronRod().register();
        ItemList.goldRod = new GoldRod().register();
        ItemList.diamondRod = new DiamondRod().register();
    }
}
