package dk.kea.class2017.sorenkt.gameengine;


import android.media.SoundPool;

public class Sound
{
    int soundId;
    SoundPool soundPool;


    //construktor
    public Sound(SoundPool soundPool, int soundId)
    {
        this.soundPool = soundPool;
        this.soundId = soundId;
    }

    public void play(float volume)
    {
        soundPool.play(soundId, volume, volume, 0, 0,1);
    }

    public void dispose()
    {
        soundPool.unload(soundId);
    }
}
