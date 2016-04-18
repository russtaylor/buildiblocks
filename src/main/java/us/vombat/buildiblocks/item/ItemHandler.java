package us.vombat.buildiblocks.item;

import us.vombat.buildiblocks.item.rod.DiamondRod;
import us.vombat.buildiblocks.item.rod.EmeraldRod;
import us.vombat.buildiblocks.item.rod.GoldRod;
import us.vombat.buildiblocks.item.rod.IronRod;

/**
 * Handles the creation of our mod's Items.
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
        ItemList.emeraldRod = new EmeraldRod().register();
    }
}
