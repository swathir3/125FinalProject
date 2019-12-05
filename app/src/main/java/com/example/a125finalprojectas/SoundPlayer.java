package com.example.a125finalprojectas;
import android.media.SoundPool;
import android.media.AudioManager;
import android.content.Context;


public class SoundPlayer {
    private static SoundPool soundPool;
    private static int correctSound;
    private static int wrongSound;

    public SoundPlayer(Context context) {
        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        correctSound = soundPool.load(context, R.raw.right, 1);
        wrongSound = soundPool.load(context, R.raw.wrong, 1);
    }
    public void playRightSound() {
        soundPool.play(correctSound, 1.0f, 1.0f, 1, 0 , 1.0f);
    }
    public void playWrongSound() {
        soundPool.play(wrongSound, 1.0f, 1.0f, 1, 0 , 1.0f);
    }
}
