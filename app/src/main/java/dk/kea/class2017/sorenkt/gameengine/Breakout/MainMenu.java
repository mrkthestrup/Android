package dk.kea.class2017.sorenkt.gameengine.Breakout;

import dk.kea.class2017.sorenkt.gameengine.GameEngine;
import dk.kea.class2017.sorenkt.gameengine.Screen;

public class MainMenu extends GameEngine
{

    @Override
    public Screen createStartScreen()
    {
        music = this.loadMusic("music.ogg");
        music.setLooping(true);
        return new MainMenuScreen(this);
    }

    public void onPause()
    {
        super.onPause();
        music.pause();
    }

    public void onResume()
    {
        super.onResume();
        music.play();
    }

}
