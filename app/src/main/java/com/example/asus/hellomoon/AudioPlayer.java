package com.example.asus.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by asus on 2016/9/15.
 */
public class AudioPlayer {
    private MediaPlayer player;
    public void stop(){
        if(player!=null)
        {
            player.release();
            if (player == null) {

            }
        }
    }
    public void play(Context c)
    {
        stop();
        player = MediaPlayer.create(c,R.raw.one_small_step);
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stop();
            }
        });
        player.start();

    }
    public void pause()
    {

    }


}
