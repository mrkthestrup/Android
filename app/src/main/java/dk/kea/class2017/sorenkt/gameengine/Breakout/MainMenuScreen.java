package dk.kea.class2017.sorenkt.gameengine.Breakout;

import android.graphics.Bitmap;

import dk.kea.class2017.sorenkt.gameengine.GameEngine;
import dk.kea.class2017.sorenkt.gameengine.Music;
import dk.kea.class2017.sorenkt.gameengine.Screen;

public class MainMenuScreen extends Screen
{

    Bitmap mainMenuBackground;
    Bitmap insertCoin;
    long startTime = System.nanoTime();
    float passedTime = 0;

    //Contruktor
    public MainMenuScreen(GameEngine game)
    {
        //load picture and music
        super(game);
        mainMenuBackground = game.loadBitmap("mainmenu.png");
        insertCoin = game.loadBitmap("insertcoin.png");
        //game.music.pause(); //just a test
    }

    //game logic fits here!
    @Override
    public void update(float deltaTime)
    {
        if (game.isTouchDown(0))
        {
            game.music.play();
            game.setScreen(new GameScreen(game)); // create a new GameScreen with the game object and then go to it
            return;
        }

        game.drawBitmap(mainMenuBackground, 0, 0);

        // make the insertcoin to blink on the screen
        passedTime += deltaTime;
        if((passedTime - (int) passedTime) > 0.5f)
        {
            game.drawBitmap(insertCoin, 160 - insertCoin.getWidth()/2, 320);
        }

    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void dispose()
    {

    }
}
