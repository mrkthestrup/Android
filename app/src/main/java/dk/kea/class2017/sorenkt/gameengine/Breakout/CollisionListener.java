package dk.kea.class2017.sorenkt.gameengine.Breakout;

public interface CollisionListener
{
    public void collisionWall();
    public void collisionPaddle();
    public void collisionBlock();
    public void collisionOutOfScreen();
}
