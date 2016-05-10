package us.vombat.buildiblocks;

import us.vombat.buildiblocks.block.BlockHandler;
import us.vombat.buildiblocks.item.ItemHandler;
import us.vombat.buildiblocks.recipe.RecipeHandler;
import us.vombat.buildiblocks.world.ModBlockGenerator;
import us.vombat.buildiblocks.world.ModWorldGenerator;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@SuppressWarnings("unused")
@Mod(modid = BuildiblocksMod.MOD_ID, name = BuildiblocksMod.MOD_NAME, version = BuildiblocksMod.VERSION)
public class BuildiblocksMod
{
    public static final String MOD_ID = "buildiblocks";
    static final String VERSION = "0.3.2";
    static final String MOD_NAME = "Buildiblocks";

    // World
    public static World world;
    public static long worldSeed;
    public static ModWorldGenerator worldGenerator;

    // Blocks
    private static BlockHandler blockHandler = new BlockHandler();

    // Items
    private static ItemHandler itemHandler = new ItemHandler();

    // Recipes
    private static RecipeHandler recipeHandler = new RecipeHandler();

    // World generation
    private ModBlockGenerator generator = new ModBlockGenerator();

    @Mod.Instance
    public static BuildiblocksMod instance;

    @SidedProxy(clientSide = "ClientProxy",
            serverSide = "CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        blockHandler.registerBlocks();
        itemHandler.registerItems();
        recipeHandler.registerRecipes();
        proxy.preInit();
    }

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {
        // No-op
    }

}
