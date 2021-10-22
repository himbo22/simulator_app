package com.tkf.simulator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView clipper_view;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clipper_view = findViewById(R.id.hair_clipper_view);
        mediaPlayer = MediaPlayer.create(this,R.raw.hair_clipper_sound);
        clipper_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                }
                else
                {
                    mediaPlayer.start();
                }

            }
        });
    }
}