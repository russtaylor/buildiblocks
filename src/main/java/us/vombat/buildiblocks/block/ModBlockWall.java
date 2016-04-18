package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import us.vombat.buildiblocks.BuildiblocksMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
        super(block.getMaterial());
        this.blockName = blockName;
        this.setDefaultState(this.blockState.getBaseState()
                .withProperty(UP, false)
                .withProperty(NORTH, false)
                .withProperty(EAST, false)
                .withProperty(SOUTH, false)
                .withProperty(WEST, false));
        this.setHardness(block.getBlockHardness(null, null));
        this.setResistance(block.getExplosionResistance(null));
        this.setStepSound(block.stepSound);
        setUnlocalizedName(blockName);
        setRegistryName(BuildiblocksMod.MOD_ID + ":" + blockName);
        setCreativeTab(CreativeTabs.tabBlock);
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

    @Override
    public boolean canPlaceTorchOnTop(IBlockAccess access, BlockPos pos) {
        return true;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess access, BlockPos pos) {
        boolean northFlag = BlockHelper.calculateWallDirection(access, pos.north(), this);
        boolean flag1 = BlockHelper.calculateWallDirection(access, pos.south(), this);
        boolean flag2 = BlockHelper.calculateWallDirection(access, pos.west(), this);
        boolean flag3 = BlockHelper.calculateWallDirection(access, pos.east(), this);
        float f = 0.25F;
        float f1 = 0.75F;
        float f2 = 0.25F;
        float f3 = 0.75F;
        float f4 = 1.0F;

        if (northFlag) {
            f2 = 0.0F;
        }

        if (flag1) {
            f3 = 1.0F;
        }

        if (flag2) {
            f = 0.0F;
        }

        if (flag3) {
            f1 = 1.0F;
        }

        if (northFlag && flag1 && !flag2 && !flag3) {
            f4 = 0.8125F;
            f = 0.3125F;
            f1 = 0.6875F;
        }

        else if (!northFlag && !flag1 && flag2 && flag3) {
            f4 = 0.8125F;
            f2 = 0.3125F;
            f3 = 0.6875F;
        }

        this.setBlockBounds(f, 0.0F, f2, f1, f4, f3);
    }

    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state) {
        this.setBlockBoundsBasedOnState(worldIn, pos);
        this.maxY = 1.5D;
        return super.getCollisionBoundingBox(worldIn, pos, state);
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
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return side == EnumFacing.DOWN || super.shouldSideBeRendered(worldIn, pos, side);
    }

    protected BlockState createBlockState() {
        IProperty[] properties = new IProperty[] {UP, NORTH, EAST, SOUTH, WEST};
        return new BlockState(this, properties);
    }

    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    public ModBlockWall register() {
        GameRegistry.registerBlock(this);
        BlockList.blockList.add(this);
        return this;
    }

}
