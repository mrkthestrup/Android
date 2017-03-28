package dk.kea.class2017.sorenkt.gameengine.Breakout;

import dk.kea.class2017.sorenkt.gameengine.GameEngine;
import dk.kea.class2017.sorenkt.gameengine.Screen;

public class MainMenu extends GameEngine
{

    @Override
    public Screen createStartScreen()
    {
        return new MainMenuScreen(this);
    }
}
