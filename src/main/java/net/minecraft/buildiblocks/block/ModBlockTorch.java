package net.minecraft.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.google.common.base.Predicate;

/**
 * The parent class for all the torches in the mod
 */
public class ModBlockTorch extends Block implements IModBlock {

    private String blockName;

    private static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>() {
        public boolean apply (EnumFacing facing) {
            return facing != EnumFacing.DOWN;
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

    public boolean canPlaceAt(World worldIn, BlockPos position, EnumFacing facing) {
        BlockPos blockPos = position.offset(facing.getOpposite());
        boolean flag = facing.getAxis().isHorizontal();
        return flag && worldIn.isSideSolid(blockPos, facing, true)
                || facing.equals(EnumFacing.UP) && this.canPlaceOn(worldIn, blockPos);
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.SOLID;
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
