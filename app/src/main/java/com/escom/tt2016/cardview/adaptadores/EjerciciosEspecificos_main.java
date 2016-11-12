package com.escom.tt2016.cardview.adaptadores;

import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.escom.tt2016.cardview.R;

public class EjerciciosEspecificos_main extends AppCompatActivity {

    MediaPlayer mPlayer;
    private boolean fabStateVolume = false;
    FloatingActionButton mFloating,mFloating2,mFloating3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios__especificos);
        mFloating=(FloatingActionButton)findViewById(R.id.fab);
        mFloating2=(FloatingActionButton)findViewById(R.id.fab2);
        mFloating3=(FloatingActionButton)findViewById(R.id.fab3);

        mFloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (fabStateVolume) {
                    if (mPlayer.isPlaying()) {
                        mPlayer.stop();

                    }
                    mFloating.setImageResource(R.drawable.ic_play);
                    fabStateVolume = false;

                } else {
                    mPlayer = MediaPlayer.create(EjerciciosEspecificos_main.this, R.raw.a);
                    mPlayer.setLooping(true);
                    mPlayer.start();
                    mFloating.setImageResource(R.drawable.ic_toast_megaphone_2);
                    fabStateVolume = true;

                }

            }
        });


        mFloating2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (fabStateVolume) {
                    if (mPlayer.isPlaying()) {
                        mPlayer.stop();

                    }
                    mFloating2.setImageResource(R.drawable.ic_play);
                    fabStateVolume = false;

                } else {
                    mPlayer = MediaPlayer.create(EjerciciosEspecificos_main.this, R.raw.aprendevovala);
                    mPlayer.setLooping(true);
                    mPlayer.start();
                    mFloating2.setImageResource(R.drawable.ic_toast_megaphone_2);
                    fabStateVolume = true;

                }

            }
        });



        mFloating3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (fabStateVolume) {
                    if (mPlayer.isPlaying()) {
                        mPlayer.stop();

                    }
                    mFloating3.setImageResource(R.drawable.ic_play);
                    fabStateVolume = false;

                } else {
                    mPlayer = MediaPlayer.create(EjerciciosEspecificos_main.this, R.raw.cancionvocales);
                    mPlayer.setLooping(true);
                    mPlayer.start();
                    mFloating3.setImageResource(R.drawable.ic_toast_megaphone_2);
                    fabStateVolume = true;

                }

            }
        });

    }
}
