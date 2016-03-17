package net.minecraft.buildiblocks;

import net.minecraft.buildiblocks.block.BlockHandler;
import net.minecraft.buildiblocks.item.ItemHandler;
import net.minecraft.buildiblocks.recipe.RecipeHandler;
import net.minecraft.buildiblocks.world.ModBlockGenerator;
import net.minecraft.buildiblocks.world.ModWorldGenerator;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@SuppressWarnings("unused")
@Mod(modid = BuildiblocksMod.MOD_ID, name = BuildiblocksMod.MOD_NAME, version = BuildiblocksMod.VERSION)
public class BuildiblocksMod
{
    public static final String MOD_ID = "buildiblocks";
    public static final String VERSION = "0.1";
    public static final String MOD_NAME = "Buildiblocks";

    // World
    public static World world;
    public static long worldSeed;
    public static ModWorldGenerator worldGenerator;

    // Blocks
    public static BlockHandler blockHandler = new BlockHandler();

    // Items
    public static ItemHandler itemHandler = new ItemHandler();

    // Recipes
    public static RecipeHandler recipeHandler = new RecipeHandler();

    // World generation
    private ModBlockGenerator generator = new ModBlockGenerator();

    @Mod.Instance
    public static BuildiblocksMod instance;

    @SidedProxy(clientSide = "net.minecraft.buildiblocks.client.ClientProxy",
            serverSide = "net.minecraft.buildiblocks.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        blockHandler.registerBlocks();
        itemHandler.registerItems();
        recipeHandler.registerRecipes();
    }

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {
        // No-op
    }

}
