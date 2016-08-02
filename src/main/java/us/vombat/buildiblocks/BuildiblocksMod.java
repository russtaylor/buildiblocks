package us.vombat.buildiblocks;

import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import us.vombat.buildiblocks.block.BlockHandler;
import us.vombat.buildiblocks.item.ItemHandler;
import us.vombat.buildiblocks.recipe.RecipeHandler;
import us.vombat.buildiblocks.world.ModBlockGenerator;
import us.vombat.buildiblocks.world.ModWorldGenerator;

@SuppressWarnings("unused")

@Mod(
        modid = BuildiblocksMod.MOD_ID,
        name = BuildiblocksMod.MOD_NAME,
        version = BuildiblocksMod.VERSION,
        acceptedMinecraftVersions = BuildiblocksMod.MINECRAFT_VERSIONS)

public class BuildiblocksMod {
    public static final String MOD_ID = "buildiblocks";
    static final String VERSION = "0.3.2";
    static final String MOD_NAME = "Buildiblocks";
    static final String MINECRAFT_VERSIONS = "[1.10]";

    private static final String CLIENT_PROXY = "us.vombat.buildiblocks.client.ClientProxy";
    private static final String SERVER_PROXY = "us.vombat.buildiblocks.CommonProxy";

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

    @SidedProxy(clientSide = BuildiblocksMod.CLIENT_PROXY, serverSide = BuildiblocksMod.SERVER_PROXY)
    private static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        blockHandler.registerBlocks();
        itemHandler.registerItems();
        recipeHandler.registerRecipes();
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {
        // No-op
    }

}
