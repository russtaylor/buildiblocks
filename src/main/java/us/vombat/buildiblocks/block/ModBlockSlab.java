package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyBool;

/**
 * Class to act as a container for singleSlabs and doubleSlabs
 */
public abstract class ModBlockSlab {
    private final ModBlockSingleSlab singleSlab;
    private final ModBlockDoubleSlab doubleSlab;

    private final String BLOCK_NAME = "unnamed_block";

    static final PropertyBool VARIANT_PROPERTY = PropertyBool.create("variant");
    static final int HALF_META_BIT = 8;

    public ModBlockSlab(String singleSlabName, Block block, float blockHardness, float blockResistance) {
        this.singleSlab = new ModBlockSingleSlab(block, singleSlabName, blockHardness, blockResistance);
        this.doubleSlab = new ModBlockDoubleSlab(singleSlab, singleSlabName, blockHardness, blockResistance);
    }

    public ModBlockSingleSlab getSingleSlab() {
        return singleSlab;
    }

    public ModBlockDoubleSlab getDoubleSlab() {
        return doubleSlab;
    }

    public String getUnlocalizedName(int meta) {
        return BLOCK_NAME;
    }

    public ModBlockSlab register() {
        BlockHelper.registerBlockAndItem(getSingleSlab(), getSingleSlab());
        return this;
    }
}
