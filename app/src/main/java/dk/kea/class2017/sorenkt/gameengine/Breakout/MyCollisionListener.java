package dk.kea.class2017.sorenkt.gameengine.Breakout;

import dk.kea.class2017.sorenkt.gameengine.Sound;

public class MyCollisionListener implements CollisionListener
{
    Sound wallSound;
    Sound paddleSound;
    Sound blockSound;

    //construktor
    public MyCollisionListener(Sound wallSound, Sound paddleSound, Sound blockSound)
    {
        this.wallSound = wallSound;
        this.paddleSound = paddleSound;
        this.blockSound = blockSound;

    }

    @Override
    public void collisionWall()
    {
        wallSound.play(1);                                                                          //full sound, it goes from 0-1
    }

    @Override
    public void collisionPaddle()
    {
        paddleSound.play(1);

    }

    @Override
    public void collisionBlock()
    {
        blockSound.play(1);
    }
}
