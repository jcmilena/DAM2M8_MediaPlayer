package com.example.juancarlosmilena.jdamediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton play, pause;
    // Objeto MediaPlayer para gestionar musica/video de forma personalizada
    MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.playImageButton);
        pause = findViewById(R.id.pauseImageButton);

        //Cargo el fichero a reproducir
        mediaPlayer = MediaPlayer.create(this, R.raw.cancion1);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gestiono el Reproductor multimedia
                mediaPlayer.start();
                mediaPlayer.setLooping(true);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gestiono el Reproductor multimedia
                mediaPlayer.pause();
            }
        });

    }


    @Override
    protected void onStop() {
        super.onStop();
        //Libero los recursos del reproductor multimedia
        mediaPlayer.release();
    }
}
