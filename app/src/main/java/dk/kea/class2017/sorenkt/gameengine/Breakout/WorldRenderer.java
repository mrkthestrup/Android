package dk.kea.class2017.sorenkt.gameengine.Breakout;

import android.graphics.Bitmap;

import dk.kea.class2017.sorenkt.gameengine.GameEngine;

public class WorldRenderer
{
    GameEngine game;
    World world;
    Bitmap ballImage;
    Bitmap paddleImage;
    Bitmap blocksImage;
    int loopSize =0;
    Block block = null;

    //contruktor
    public WorldRenderer(GameEngine game, World world)
    {
        this.game = game;
        this.world = world;
        ballImage = game.loadBitmap("ball.png");
        paddleImage = game.loadBitmap("paddle.png");
        blocksImage = game.loadBitmap("blocks.png");
    }

    //draw the object
    public void render()
    {
        game.drawBitmap(ballImage, (int)world.ball.x, (int)world.ball.y);
        game.drawBitmap(paddleImage, (int)world.paddle.x, (int)world.paddle.y);

        //drawring blocks from 1 picture
        loopSize = world.blockArrayList.size();
        for (int i = 0; i < loopSize; i++)
        {
            block = world.blockArrayList.get(i);
            game.drawBitmap(blocksImage, (int)block.x, (int)block.y,
                    0,(int)(block.type * Block.HEIGHT),(int)Block.WIDTH, (int)Block.HEIGHT); //part of the bitmap
        }
    }
}
