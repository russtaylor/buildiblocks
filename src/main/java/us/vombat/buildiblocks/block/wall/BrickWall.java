package us.vombat.buildiblocks.block.wall;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.block.ModBlockWall;

/**
 * Brick walls.
 *
 * Created by russt on 12/2/14.
 */
public class BrickWall extends ModBlockWall {
    public static final String BLOCK_NAME = "brick_wall";

    public BrickWall(Block block) {
        super(block, BLOCK_NAME);
    }
}
