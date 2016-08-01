package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import us.vombat.buildiblocks.BuildiblocksMod;

/**
 * Parent class for all walls.
 */
public class ModBlockWall extends Block implements IModBlock {

    private static final PropertyBool UP = PropertyBool.create("up");
    private static final PropertyBool NORTH = PropertyBool.create("north");
    private static final PropertyBool EAST = PropertyBool.create("east");
    private static final PropertyBool SOUTH = PropertyBool.create("south");
    private static final PropertyBool WEST = PropertyBool.create("west");

    private String blockName;

    public ModBlockWall(Block block, String blockName) {
        super(block.getMaterial(null));
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

    public boolean isFullCube() {
        return false;
    }

    public boolean isPassable(IBlockAccess blockAccess, BlockPos pos) {
        return false;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean canPlaceTorchOnTop(IBlockAccess access, BlockPos pos) {
        return true;
    }


    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state) {
        return super.getCollisionBoundingBox(state, worldIn, pos);
    }

    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return state.withProperty(UP, !worldIn.isAirBlock(pos.up()))
                .withProperty(NORTH, BlockHelper.calculateWallDirection(worldIn, pos.north(), this))
                .withProperty(EAST, BlockHelper.calculateWallDirection(worldIn, pos.east(), this))
                .withProperty(SOUTH, BlockHelper.calculateWallDirection(worldIn, pos.south(), this))
                .withProperty(WEST, BlockHelper.calculateWallDirection(worldIn, pos.west(), this));
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState();
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return side == EnumFacing.DOWN || super.shouldSideBeRendered(blockState, worldIn, pos, side);
    }

    protected BlockStateContainer createBlockState() {
        IProperty[] properties = new IProperty[]{UP, NORTH, EAST, SOUTH, WEST};
        return new BlockStateContainer(this, properties);
    }

    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    public ModBlockWall register() {
        BlockList.blockList.add(this);
        return this;
    }

}
