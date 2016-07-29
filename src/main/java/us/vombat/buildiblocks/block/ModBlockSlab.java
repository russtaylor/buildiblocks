package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;

/**
 * Class to act as a container for singleSlabs and doubleSlabs
 */
public abstract class ModBlockSlab extends BlockSlab {
    private final ModBlockSingleSlab singleSlab;
    private final ModBlockDoubleSlab doubleSlab;

    private final String BLOCK_NAME = "unnamed_block";

    public ModBlockSlab(String singleSlabName, Block parentBlock, float blockHardness, float blockResistance) {
        super(parentBlock.getMaterial(null));
        this.singleSlab = new ModBlockSingleSlab(parentBlock, singleSlabName, blockHardness, blockResistance);
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
        BlockList.blockList.add(singleSlab);
        return this;
    }
}
