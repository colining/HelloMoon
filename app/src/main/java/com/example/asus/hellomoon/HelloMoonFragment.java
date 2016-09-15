package com.example.asus.hellomoon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.security.PublicKey;

/**
 * Created by asus on 2016/9/15.
 */
public class HelloMoonFragment extends Fragment {
    private Button playbutton;
    private  Button stopbutton;
    private  AudioPlayer player = new AudioPlayer();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle s)
    {
        View v = inflater.inflate(R.layout.fragment_hello_moon,parent,false);
        playbutton =(Button) v.findViewById(R.id.hello_playButton);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.play(getActivity());
            }
        });
        stopbutton=(Button) v.findViewById(R.id.hello_stopButton);
        stopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.stop();
            }
        });

        return  v;

    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        player.stop();
    }
}
