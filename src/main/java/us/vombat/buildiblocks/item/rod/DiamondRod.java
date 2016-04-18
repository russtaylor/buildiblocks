package us.vombat.buildiblocks.item.rod;

import us.vombat.buildiblocks.item.ModItem;

/**
 * Diamond rods.
 *
 * Created by russt on 12/22/14.
 */
public class DiamondRod extends ModItem {

    public static final String ITEM_NAME = "diamond_rod";

    public DiamondRod() {
        super(ITEM_NAME);
    }

    public ModItem register() {
        return register(ITEM_NAME);
    }
}
