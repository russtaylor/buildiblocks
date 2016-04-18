package us.vombat.buildiblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * The parent class for pillars in the mod.
 */
public class ModBlockPillar extends BlockRotatedPillar implements IModBlock {

    private String blockName;

    private static final PropertyEnum<EnumFacing.Axis> AXIS = PropertyEnum.create("axis", EnumFacing.Axis.class);

    public ModBlockPillar(Block block, String blockName) {
        super(block.getMaterial());
        this.blockName = blockName;
        this.setHardness(block.getBlockHardness(null, null));
        this.setResistance(block.getExplosionResistance(null));
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(block.stepSound);
        this.setUnlocalizedName(blockName);
        this.setRegistryName(blockName);
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.SOLID;
    }

    public String getBlockName() {
        return blockName;
    }

    public ModBlockPillar register() {
        GameRegistry.registerBlock(this);
        BlockList.blockList.add(this);
        return this;
    }

    protected BlockState createBlockState() {
        IProperty[] properties = new IProperty[] {AXIS};
        return new BlockState(this, properties);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
         int i = 0;
        EnumFacing.Axis enumFacingAxis = state.getValue(AXIS);

        if (enumFacingAxis == EnumFacing.Axis.X) {
            i |= 4;
        }
        else if (enumFacingAxis == EnumFacing.Axis.Z) {
            i |= 8;
        }

        return i;
    }

    public boolean rotateBlock(net.minecraft.world.World world, net.minecraft.util.BlockPos pos, EnumFacing axis) {
        net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
        for (net.minecraft.block.properties.IProperty<?> prop : state.getProperties().keySet()) {
            if (prop.getName().equals("axis")) {
                world.setBlockState(pos, state.cycleProperty(prop));
                return true;
            }
        }
        return false;
    }

    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer)
                .withProperty(AXIS, facing.getAxis());
    }
}
