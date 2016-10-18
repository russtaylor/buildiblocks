package us.vombat.buildiblocks.block;

/**
 * Defines functionality used for Slab Containers
 */
public interface ModSlabContainerInterface {
    ModBlockSingleSlab getSingleSlab();

    ModBlockDoubleSlab getDoubleSlab();

    ModSlabContainerInterface register();
}
