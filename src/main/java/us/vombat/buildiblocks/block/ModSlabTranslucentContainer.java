package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;

/**
 * Provides an interface for registering Slabs.
 */
public abstract class ModSlabTranslucentContainer implements ModSlabContainerInterface {

    private final ModBlockTranslucentSingleSlab singleSlab;
    private final ModBlockTranslucentDoubleSlab doubleSlab;

    public ModSlabTranslucentContainer(String singleSlabName, Block block) {
        this.singleSlab = new ModBlockTranslucentSingleSlab(block, singleSlabName);
        this.doubleSlab = new ModBlockTranslucentDoubleSlab(singleSlab, singleSlabName);
    }

    public ModBlockSingleSlab getSingleSlab() {
        return singleSlab;
    }

    public ModBlockDoubleSlab getDoubleSlab() {
        return doubleSlab;
    }

    public ModSlabTranslucentContainer register() {
        BlockHelper.registerSlabAndItem(this);
        return this;
    }
}
