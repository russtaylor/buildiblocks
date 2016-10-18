package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;

/**
 * Provides an interface for registering Slabs.
 */
public abstract class ModSlabContainer implements ModSlabContainerInterface {

    private final ModBlockSingleSlab singleSlab;
    private final ModBlockDoubleSlab doubleSlab;

    public ModSlabContainer(String singleSlabName, Block block) {
        this.singleSlab = new ModBlockSingleSlab(block, singleSlabName);
        this.doubleSlab = new ModBlockDoubleSlab(singleSlab, singleSlabName);
    }

    public ModBlockSingleSlab getSingleSlab() {
        return singleSlab;
    }

    public ModBlockDoubleSlab getDoubleSlab() {
        return doubleSlab;
    }

    public ModSlabContainer register() {
        BlockHelper.registerSlabAndItem(this);
        return this;
    }
}
