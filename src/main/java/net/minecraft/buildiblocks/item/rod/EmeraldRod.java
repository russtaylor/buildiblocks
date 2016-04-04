package net.minecraft.buildiblocks.item.rod;

import net.minecraft.buildiblocks.item.ModItem;

/**
 * Emerald rods.
 */
public class EmeraldRod extends ModItem {

    public static final String ITEM_NAME = "emerald_rod";

    public EmeraldRod() {
        super(ITEM_NAME);
    }

    public ModItem register() {
        return register(ITEM_NAME);
    }
}
