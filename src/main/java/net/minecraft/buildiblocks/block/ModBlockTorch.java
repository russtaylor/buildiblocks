package net.minecraft.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.google.common.base.Predicate;

import java.util.Random;

/**
 * The parent class for all the torches in the mod
 */
public class ModBlockTorch extends Block implements IModBlock {

    private String blockName;

    private static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>() {
        public boolean apply (EnumFacing facing) {
            return true;
        }
    });

    public ModBlockTorch(String blockName) {
        super(Material.circuits);
        this.blockName = blockName;
        this.setLightLevel(1F);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName(blockName);
        this.setRegistryName(blockName);
    }

    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state) {
        return null;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean isFullCube() {
        return false;
    }

    private boolean canPlaceOn(World worldIn, BlockPos position) {
        if (World.doesBlockHaveSolidTopSurface(worldIn, position)) {
            return true;
        } else {
            Block block = worldIn.getBlockState(position).getBlock();
            return block.canPlaceTorchOnTop(worldIn, position);
        }
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos position) {
        for (EnumFacing enumFacing: FACING.getAllowedValues()) {
            if (this.canPlaceAt(worldIn, position, enumFacing)) {
                return true;
            }
        }
        return false;
    }

    private boolean canPlaceUnder(World worldIn, BlockPos position) {
        Block block = worldIn.getBlockState(position).getBlock();
        return block.isSideSolid(worldIn, position, EnumFacing.DOWN) || block.canPlaceTorchOnTop(worldIn, position);
    }

    private boolean canPlaceAt(World worldIn, BlockPos position, EnumFacing facing) {
        BlockPos blockPos = position.offset(facing.getOpposite());
        boolean flag = facing.getAxis().isHorizontal();
        return flag && worldIn.isSideSolid(blockPos, facing, true)
                || facing.equals(EnumFacing.UP) && this.canPlaceOn(worldIn, blockPos)
                || facing.equals(EnumFacing.DOWN) && this.canPlaceUnder(worldIn, blockPos);
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

    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        this.checkForDrop(worldIn, pos, state);
    }

    /**
     * Called when a neighboring block changes.
     */
    public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock) {
        this.onNeighborChangeInternal(worldIn, pos, state);
    }

    private boolean onNeighborChangeInternal(World worldIn, BlockPos pos, IBlockState state) {
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
                    (this.canPlaceOn(worldIn, pos.offset(enumFacingOpposite)) ||
                    this.canPlaceUnder(worldIn, pos.offset(enumFacingOpposite)))) {
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

    private boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state) {
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
     * Ray traces through the blocks collision from start vector to end vector returning a ray trace hit.
     */
    public MovingObjectPosition collisionRayTrace(World worldIn, BlockPos pos, Vec3 start, Vec3 end) {
        EnumFacing enumfacing = worldIn.getBlockState(pos).getValue(FACING);
        float f = 0.15F;

        if (enumfacing == EnumFacing.EAST) {
            this.setBlockBounds(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
        } else if (enumfacing == EnumFacing.WEST) {
            this.setBlockBounds(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
        } else if (enumfacing == EnumFacing.SOUTH) {
            this.setBlockBounds(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
        } else if (enumfacing == EnumFacing.NORTH) {
            this.setBlockBounds(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
        } else {
            f = 0.1F;
            this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
        }

        return super.collisionRayTrace(worldIn, pos, start, end);
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
        double d0 = (double)pos.getX() + 0.5D;
        double d1 = (double)pos.getY() + 0.7D;
        double d2 = (double)pos.getZ() + 0.5D;
        double d3 = 0.22D;
        double d4 = 0.27D;

        if (enumFacing.getAxis().isHorizontal()) {
            EnumFacing enumFacingOpposite = enumFacing.getOpposite();
            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4 * (double)enumFacingOpposite.getFrontOffsetX(), d1 + d3, d2 + d4 * (double)enumFacingOpposite.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D, new int[0]);
            worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4 * (double)enumFacingOpposite.getFrontOffsetX(), d1 + d3, d2 + d4 * (double)enumFacingOpposite.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D, new int[0]);
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

    protected BlockState createBlockState() {
        IProperty[] properties = new IProperty[] {FACING};
        return new BlockState(this, properties);
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }

    public String getBlockName() {
        return blockName;
    }

    public ModBlockTorch register() {
        GameRegistry.registerBlock(this);
        BlockList.blockList.add(this);
        return this;
    }
}
