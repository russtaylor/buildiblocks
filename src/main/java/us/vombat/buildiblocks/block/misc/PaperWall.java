package us.vombat.buildiblocks.block.misc;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import us.vombat.buildiblocks.block.ModBlock;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Paper Walls
 */
public class PaperWall extends ModBlock {

    public static final String BLOCK_NAME = "paper_wall";

    private static final PropertyDirection DIRECTION = PropertyDirection.create("direction", EnumFacing.Plane.HORIZONTAL);

    private static final AxisAlignedBB[] AABB_BY_INDEX = new AxisAlignedBB[]{
            new AxisAlignedBB(0F, 0F, 0.4375F, 1F, 1F, 0.5624F),
            new AxisAlignedBB(0.4375F, 0F, 0F, 0.5624F, 1F, 1F)
    };

    public PaperWall() {
        super(Blocks.WOOL, BLOCK_NAME);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean isFullCube() {
        return false;
    }

    protected BlockStateContainer createBlockState() {
        IProperty[] properties = new IProperty[]{DIRECTION};
        return new BlockStateContainer(this, properties);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        EnumFacing direction = state.getValue(DIRECTION);
        return direction.getHorizontalIndex();
    }

    public boolean rotateBlock(net.minecraft.world.World world, BlockPos pos, EnumFacing axis) {
        net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
        for (net.minecraft.block.properties.IProperty<?> prop : state.getProperties().keySet()) {
            if (prop.getName().equals("direction")) {
                world.setBlockState(pos, state.cycleProperty(prop));
                return true;
            }
        }
        return false;
    }

    public void addCollisionBoxToList(
            IBlockState state,
            BlockPos position,
            AxisAlignedBB entityBox,
            List<AxisAlignedBB> collidingBoxes,
            @Nullable Entity entityIn) {
        EnumFacing direction = state.getValue(DIRECTION);
        if (direction == EnumFacing.NORTH || direction == EnumFacing.SOUTH) {
            addCollisionBoxToList(position, entityBox, collidingBoxes, AABB_BY_INDEX[0]);
        } else {
            addCollisionBoxToList(position, entityBox, collidingBoxes, AABB_BY_INDEX[1]);
        }
    }
}
