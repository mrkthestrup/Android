package dk.kea.class2017.sorenkt.gameengine;

public class TouchEvent
{
    public enum TouchEventType
    {
        Down,
        Up,
        Draggged
    }

    public TouchEventType type; // the type of the event
    public int x;               // x- coortinate of the event
    public int y;               // y- coortinate of the event
    public int pointer;         // the pointer id (from the android system)
}
