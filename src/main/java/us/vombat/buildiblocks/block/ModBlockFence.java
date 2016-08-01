package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Parent class for all fences.
 */
public class ModBlockFence extends Block implements IModBlock {

    private static final PropertyBool NORTH = PropertyBool.create("north");
    private static final PropertyBool EAST = PropertyBool.create("east");
    private static final PropertyBool SOUTH = PropertyBool.create("south");
    private static final PropertyBool WEST = PropertyBool.create("west");
    private static final AxisAlignedBB[] BOUNDING_BOXES = new AxisAlignedBB[]{new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D), new AxisAlignedBB(0.0D, 0.0D, 0.375D, 0.625D, 1.0D, 1.0D), new AxisAlignedBB(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.625D, 1.0D, 0.625D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 1.0D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D), new AxisAlignedBB(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 1.0D), new AxisAlignedBB(0.375D, 0.0D, 0.0D, 1.0D, 1.0D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.625D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
    private static final AxisAlignedBB PILLAR_AABB = new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 1.5D, 0.625D);
    private static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.375D, 0.0D, 0.625D, 0.625D, 1.5D, 1.0D);
    private static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.375D, 0.375D, 1.5D, 0.625D);
    private static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.375D, 0.0D, 0.0D, 0.625D, 1.5D, 0.375D);
    private static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.625D, 0.0D, 0.375D, 1.0D, 1.5D, 0.625D);

    private String blockName;

    public ModBlockFence(Block block, String blockName) {
        super(block.getMaterial(null));
        this.blockName = blockName;
        this.setDefaultState(this.blockState.getBaseState()
                .withProperty(NORTH, false)
                .withProperty(EAST, false)
                .withProperty(SOUTH, false)
                .withProperty(WEST, false));
        this.setHardness(block.getBlockHardness(null, null, null));
        this.setResistance(block.getExplosionResistance(null));
        this.setSoundType(block.getSoundType());
        setUnlocalizedName(blockName);
        setRegistryName(blockName);
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

    public boolean canConnectTo(IBlockAccess worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();
        return block != Blocks.BARRIER && (!((!(block instanceof BlockFence) || (block.getMaterial(null) != this.blockMaterial)) && !(block instanceof BlockFenceGate)) || ((block.getMaterial(null).isOpaque() && iblockstate.isFullCube()) && block.getMaterial(null) != Material.GOURD));
    }

    /**
     * Calculates the directions that the fence should face, based on the materials/blocks in each
     * adjacent block location.
     *
     * @param blockAccess block access
     * @param blockPos    the specified position
     * @return Whether or not the fence should point toward the specified block.
     */
    private boolean calculateFenceDirection(IBlockAccess blockAccess, BlockPos blockPos) {
        Block block = blockAccess.getBlockState(blockPos).getBlock();
        if (block != this) {
            if (block != Blocks.BARRIER) {
                if (block.getMaterial(block.getDefaultState()).isOpaque()) {
                    if (block.isFullCube(block.getDefaultState())) {
                        return Material.GOURD != block.getMaterial(block.getDefaultState());
                    }
                }
            }
            return false;
        } else {
            return block != Blocks.BARRIER;
        }
    }

    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn) {
        state = state.getActualState(worldIn, pos);
        addCollisionBoxToList(pos, entityBox, collidingBoxes, PILLAR_AABB);

        if (state.getValue(NORTH)) {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, NORTH_AABB);
        }

        if (state.getValue(EAST)) {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, EAST_AABB);
        }

        if (state.getValue(SOUTH)) {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, SOUTH_AABB);
        }

        if (state.getValue(WEST)) {
            addCollisionBoxToList(pos, entityBox, collidingBoxes, WEST_AABB);
        }
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        state = this.getActualState(state, source, pos);
        return BOUNDING_BOXES[getBoundingBoxIdx(state)];
    }

    /**
     * Returns the correct index into boundingBoxes, based on what the fence is connected to.
     */
    private static int getBoundingBoxIdx(IBlockState state) {
        int i = 0;

        if (state.getValue(NORTH)) {
            i |= 1 << EnumFacing.NORTH.getHorizontalIndex();
        }

        if (state.getValue(EAST)) {
            i |= 1 << EnumFacing.EAST.getHorizontalIndex();
        }

        if (state.getValue(SOUTH)) {
            i |= 1 << EnumFacing.SOUTH.getHorizontalIndex();
        }

        if (state.getValue(WEST)) {
            i |= 1 << EnumFacing.WEST.getHorizontalIndex();
        }

        return i;
    }

    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return state.withProperty(NORTH, this.calculateFenceDirection(worldIn, pos.north()))
                .withProperty(EAST, this.calculateFenceDirection(worldIn, pos.east()))
                .withProperty(SOUTH, this.calculateFenceDirection(worldIn, pos.south()))
                .withProperty(WEST, this.calculateFenceDirection(worldIn, pos.west()));
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState();
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return true;
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, NORTH, EAST, WEST, SOUTH);
    }

    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    public ModBlockFence register(String blockName) {
        BlockList.blockList.add(this);
        return this;
    }
}
