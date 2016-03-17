package net.minecraft.buildiblocks.block.walls;

import net.minecraft.block.Block;
import net.minecraft.buildiblocks.block.ModBlockWall;

/**
 * Stone walls.
 *
 * Created by russt on 12/2/14.
 */
public class PolishedAndesiteWall extends ModBlockWall {
    public static final String BLOCK_NAME = "stone_wall";

    public PolishedAndesiteWall(Block block) {
        super(block, BLOCK_NAME);
    }

    public ModBlockWall register() {
        return register(BLOCK_NAME);
    }
}
