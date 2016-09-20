package us.vombat.buildiblocks.block;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

/**
 * The parent class for all the torches in the mod
 */
public class ModBlockTorch extends Block implements IModBlock {

    private String blockName;

    private static final AxisAlignedBB STANDING_AABB = new AxisAlignedBB(0.4000000059604645D, 0.0D, 0.4000000059604645D, 0.6000000238418579D, 0.6000000238418579D, 0.6000000238418579D);
    private static final AxisAlignedBB TORCH_NORTH_AABB = new AxisAlignedBB(0.3499999940395355D, 0.20000000298023224D, 0.699999988079071D, 0.6499999761581421D, 0.800000011920929D, 1.0D);
    private static final AxisAlignedBB TORCH_SOUTH_AABB = new AxisAlignedBB(0.3499999940395355D, 0.20000000298023224D, 0.0D, 0.6499999761581421D, 0.800000011920929D, 0.30000001192092896D);
    private static final AxisAlignedBB TORCH_WEST_AABB = new AxisAlignedBB(0.699999988079071D, 0.20000000298023224D, 0.3499999940395355D, 1.0D, 0.800000011920929D, 0.6499999761581421D);
    private static final AxisAlignedBB TORCH_EAST_AABB = new AxisAlignedBB(0.0D, 0.20000000298023224D, 0.3499999940395355D, 0.30000001192092896D, 0.800000011920929D, 0.6499999761581421D);
    private static final AxisAlignedBB HANGING_AABB = new AxisAlignedBB(0.4000000059604645D, 0.4000000059604645D, 0.4000000059604645D, 0.6000000238418579D, 1.0D, 0.6000000238418579D);

    private static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>() {
        public boolean apply(EnumFacing facing) {
            return true;
        }
    });

    public ModBlockTorch(String blockName) {
        super(Material.CIRCUITS);
        this.blockName = blockName;
        setLightLevel(1F);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setUnlocalizedName(blockName);
        setRegistryName(blockName);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        switch (state.getValue(FACING)) {
            case EAST:
                return TORCH_EAST_AABB;
            case WEST:
                return TORCH_WEST_AABB;
            case SOUTH:
                return TORCH_SOUTH_AABB;
            case NORTH:
                return TORCH_NORTH_AABB;
            case DOWN:
                return HANGING_AABB;
            default:
                return STANDING_AABB;
        }
    }

    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
        return NULL_AABB;
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    private boolean canPlaceOn(World worldIn, BlockPos position) {
        if (worldIn.isSideSolid(position, EnumFacing.UP)) {
            return true;
        } else {
            IBlockState blockState = worldIn.getBlockState(position);
            Block block = blockState.getBlock();
            return block.canPlaceTorchOnTop(blockState, worldIn, position);
        }
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos position) {
        for (EnumFacing enumFacing : FACING.getAllowedValues()) {
            if (this.canPlaceAt(worldIn, position, enumFacing)) {
                return true;
            }
        }
        return false;
    }

    private boolean canPlaceUnder(World worldIn, BlockPos position) {
        IBlockState blockState = worldIn.getBlockState(position);
        Block block = blockState.getBlock();
        return worldIn.isSideSolid(position, EnumFacing.DOWN) || block.canPlaceTorchOnTop(blockState, worldIn, position);
    }

    private boolean canPlaceAt(World worldIn, BlockPos position, EnumFacing facing) {
        BlockPos blockPos = position.offset(facing.getOpposite());
        boolean flag = facing.getAxis().isHorizontal();
        return (flag && worldIn.isSideSolid(blockPos, facing, true))
                || (facing.equals(EnumFacing.UP) && canPlaceOn(worldIn, blockPos))
                || (facing.equals(EnumFacing.DOWN) && canPlaceUnder(worldIn, blockPos));
    }

    /**
     * Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the
     * IBlockstate
     */
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        if (this.canPlaceAt(worldIn, pos, facing)) {
            return this.getDefaultState().withProperty(FACING, facing);
        } else {
            for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {
                if (worldIn.isSideSolid(pos.offset(enumfacing.getOpposite()), enumfacing, true)) {
                    return this.getDefaultState().withProperty(FACING, enumfacing);
                }
            }

            return this.getDefaultState();
        }
    }

    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        this.checkForDrop(worldIn, pos, state);
    }

    protected boolean onNeighborChangeInternal(World worldIn, BlockPos pos, IBlockState state) {
        if (!this.checkForDrop(worldIn, pos, state)) {
            return true;
        } else {
            EnumFacing enumFacing = state.getValue(FACING);
            EnumFacing.Axis enumFacingAxis = enumFacing.getAxis();
            EnumFacing enumFacingOpposite = enumFacing.getOpposite();
            boolean flag = false;

            if (enumFacingAxis.isHorizontal() && !worldIn.isSideSolid(pos.offset(enumFacingOpposite), enumFacing, true)) {
                flag = true;
            } else if (enumFacingAxis.isVertical() &&
                    (!this.canPlaceOn(worldIn, pos.offset(enumFacingOpposite)) ||
                            !this.canPlaceUnder(worldIn, pos.offset(enumFacingOpposite)))) {
                flag = true;
            }

            if (flag) {
                this.dropBlockAsItem(worldIn, pos, state, 0);
                worldIn.setBlockToAir(pos);
                return true;
            } else {
                return false;
            }
        }
    }

    protected boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state) {
        if (state.getBlock() == this && this.canPlaceAt(worldIn, pos, state.getValue(FACING))) {
            return true;
        } else {
            if (worldIn.getBlockState(pos).getBlock() == this) {
                this.dropBlockAsItem(worldIn, pos, state, 0);
                worldIn.setBlockToAir(pos);
            }

            return false;
        }
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState();

        switch (meta) {
            case 1:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.EAST);
                break;
            case 2:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST);
                break;
            case 3:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.SOUTH);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.NORTH);
                break;
            case 5:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.UP);
                break;
            case 6:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.DOWN);
                break;
            default:
                iblockstate = iblockstate.withProperty(FACING, EnumFacing.UP);
        }

        return iblockstate;
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        EnumFacing enumFacing = state.getValue(FACING);
        double d0 = (double) pos.getX() + 0.5D;
        double d1 = (double) pos.getY() + 0.7D;
        double d2 = (double) pos.getZ() + 0.5D;
        double d3 = 0.22D;
        double d4 = 0.27D;

        if (enumFacing.getAxis().isHorizontal()) {
            EnumFacing enumFacingOpposite = enumFacing.getOpposite();
            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4 * (double) enumFacingOpposite.getFrontOffsetX(), d1 + d3, d2 + d4 * (double) enumFacingOpposite.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D, new int[0]);
            worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4 * (double) enumFacingOpposite.getFrontOffsetX(), d1 + d3, d2 + d4 * (double) enumFacingOpposite.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D, new int[0]);
        } else {
            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D);
            worldIn.spawnParticle(EnumParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        int i = 0;

        switch (state.getValue(FACING)) {
            case EAST:
                i = i | 1;
                break;
            case WEST:
                i = i | 2;
                break;
            case SOUTH:
                i = i | 3;
                break;
            case NORTH:
                i = i | 4;
                break;
            case DOWN:
                i = i | 6;
            case UP:
            default:
                i = i | 5;
        }

        return i;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        IProperty[] properties = new IProperty[]{FACING};
        return new BlockStateContainer(this, properties);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    public String getBlockName() {
        return blockName;
    }

    public ModBlockTorch register() {
        return (ModBlockTorch) BlockHelper.registerBlockAndItem(this, this);
    }
}
