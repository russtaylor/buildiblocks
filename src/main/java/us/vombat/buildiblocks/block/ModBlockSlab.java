package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyBool;
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.vombat.buildiblocks.item.ModItemSlab;

/**
 * Class to act as a container for singleSlabs and doubleSlabs
 */
public abstract class ModBlockSlab {
    private final Block parentBlock;
    private final ModBlockSingleSlab singleSlab;
    private final ModBlockDoubleSlab doubleSlab;

    static final PropertyBool VARIANT_PROPERTY = PropertyBool.create("variant");
    static final int HALF_META_BIT = 8;

    public ModBlockSlab(String singleSlabName, Block block, float blockHardness, float blockResistance) {
        this.parentBlock = block;
        this.singleSlab = new ModBlockSingleSlab(block, singleSlabName, blockHardness, blockResistance);
        this.doubleSlab = new ModBlockDoubleSlab(singleSlab, singleSlabName, blockHardness, blockResistance);
    }

    private Block getParentBlock() {
        return parentBlock;
    }

    public ModBlockSingleSlab getSingleSlab() {
        return singleSlab;
    }

    public ModBlockDoubleSlab getDoubleSlab() {
        return doubleSlab;
    }

    public ModBlockSlab register() {
        // Register the single slab
        BlockList.blockList.add(getSingleSlab());
        GameRegistry.register(getSingleSlab());
        // Register the double slab
        BlockList.blockList.add(getDoubleSlab());
        GameRegistry.register(getDoubleSlab());
        // Register the item
        ModItemSlab itemSlab = new ModItemSlab(getParentBlock(), getSingleSlab(), getDoubleSlab());
        itemSlab.setRegistryName(getSingleSlab().getRegistryName());
        GameRegistry.register(itemSlab);
        return this;
    }
}
