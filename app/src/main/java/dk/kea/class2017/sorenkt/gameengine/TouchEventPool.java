package dk.kea.class2017.sorenkt.gameengine;

public class TouchEventPool extends Pool<TouchEvent>
{

    @Override
    protected TouchEvent newItem()
    {
        return new TouchEvent();
    }
}
