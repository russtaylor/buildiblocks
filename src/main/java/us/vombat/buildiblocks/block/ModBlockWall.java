package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.creativetab.CreativeTabs;
import us.vombat.buildiblocks.BuildiblocksMod;

/**
 * Parent class for all walls.
 */
public class ModBlockWall extends BlockWall implements IModBlock {

    private static final PropertyBool UP = PropertyBool.create("up");
    private static final PropertyBool NORTH = PropertyBool.create("north");
    private static final PropertyBool EAST = PropertyBool.create("east");
    private static final PropertyBool SOUTH = PropertyBool.create("south");
    private static final PropertyBool WEST = PropertyBool.create("west");

    private String blockName;

    public ModBlockWall(Block block, String blockName) {
        super(block);
        this.blockName = blockName;
        this.setDefaultState(this.blockState.getBaseState()
                .withProperty(UP, false)
                .withProperty(NORTH, false)
                .withProperty(EAST, false)
                .withProperty(SOUTH, false)
                .withProperty(WEST, false));
        this.setHardness(block.getBlockHardness(null, null, null));
        this.setResistance(block.getExplosionResistance(null));
        this.setSoundType(block.getSoundType());
        setUnlocalizedName(blockName);
        setRegistryName(BuildiblocksMod.MOD_ID + ":" + blockName);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        useNeighborBrightness = true;
    }

    @Override
    public String getBlockName() {
        return blockName;
    }

    public ModBlockWall register() {
        return (ModBlockWall) BlockHelper.registerBlockAndItem(this, this);
    }

}
