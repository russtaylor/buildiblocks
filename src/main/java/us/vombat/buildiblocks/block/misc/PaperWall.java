package us.vombat.buildiblocks.block.misc;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import us.vombat.buildiblocks.block.BlockList;
import us.vombat.buildiblocks.block.ModBlock;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Paper Walls
 */
public class PaperWall extends ModBlock {

    public static final String BLOCK_NAME = "paper_wall";

    private static final PropertyDirection DIRECTION = PropertyDirection.create("direction", EnumFacing.Plane.HORIZONTAL);

    public PaperWall() {
        super(Blocks.wool, BLOCK_NAME);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean isFullCube() {
        return false;
    }

    public PaperWall register() {
        GameRegistry.registerBlock(this);
        BlockList.blockList.add(this);
        return this;
    }

    protected BlockState createBlockState() {
        IProperty[] properties = new IProperty[] {DIRECTION};
        return new BlockState(this, properties);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        EnumFacing direction = state.getValue(DIRECTION);
        return direction.getHorizontalIndex();
    }

    public boolean rotateBlock(net.minecraft.world.World world, net.minecraft.util.BlockPos pos, EnumFacing axis) {
        net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
        for (net.minecraft.block.properties.IProperty<?> prop : state.getProperties().keySet()) {
            if (prop.getName().equals("direction")) {
                world.setBlockState(pos, state.cycleProperty(prop));
                return true;
            }
        }
        return false;
    }

    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        EnumFacing enumFacing = (placer == null) ? EnumFacing.NORTH : EnumFacing.fromAngle(placer.rotationYaw);
        return this.getDefaultState().withProperty(DIRECTION, enumFacing);
    }

    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos position, IBlockState state) {
        this.updateBlockBounds(state);
        return super.getCollisionBoundingBox(worldIn, position, state);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos position) {
        IBlockState blockState = worldIn.getBlockState(position);
        this.updateBlockBounds(blockState);
    }

    private void updateBlockBounds(IBlockState blockState) {
        EnumFacing direction = blockState.getValue(DIRECTION);
        if (direction == EnumFacing.NORTH || direction == EnumFacing.SOUTH) {
            this.setBlockBounds(0F, 0F, 0.4375F, 1F, 1F, 0.5624F);
        } else {
            this.setBlockBounds(0.4375F, 0F, 0F, 0.5624F, 1F, 1F);
        }
    }
}
