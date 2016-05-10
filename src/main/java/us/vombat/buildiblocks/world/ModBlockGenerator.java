package us.vombat.buildiblocks.world;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Adds the custom blocks we've created to world generation.
 */
public class ModBlockGenerator implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider iChunkProvider1) {
        if(world.provider.getDimension() == 0) { // Only spawn in the normal world.
            //Overworld spawning should occur here.
        }
    }

    public void addBlockSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos,
                              int maxY, int maxVeinSize, int chancesToSpawn) {
        for (int i = 0; i < chancesToSpawn; i++) {
            int firstBlockXCoord = (blockXPos * 16) + random.nextInt(16);
            int firstBlockYCoord = random.nextInt(maxY);
            int firstBlockZCoord = (blockZPos * 16) + random.nextInt(16);
            BlockPos position = new BlockPos(firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
            new WorldGenMinable(block, maxVeinSize).generate(world, random, position);
        }
    }
}
