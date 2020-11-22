package com.example.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import java.util.concurrent.Delayed;

public class MainActivity extends AppCompatActivity {

    MediaPlayer sound1, sound2, sound3, sound4, sound5, sound6;
    ImageButton button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (ImageButton) findViewById(R.id.button1);
        sound1 = MediaPlayer.create(this, R.raw.coin);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound1.start();
                button1.setColorFilter(Color.argb(75, 58, 255, 33));
                button1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button1.setColorFilter(Color.argb(255,58,255, 33));
                    }
                }, 1000);
            }
        });


        button2 = (ImageButton) findViewById(R.id.button2);
        sound2 = MediaPlayer.create(this, R.raw.gameover);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound2.start();
                button2.setColorFilter(Color.argb(75, 21,255,251));
                button2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button2.setColorFilter(Color.argb(255, 21,255,251));
                    }
                }, 3800);
            }
        });

        button3 = (ImageButton) findViewById(R.id.button3);
        sound3 = MediaPlayer.create(this, R.raw.jump);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound3.start();
                button3.setColorFilter(Color.argb(75, 40,55,255));
                button3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button3.setColorFilter(Color.argb(255, 40,55,255));
                    }
                }, 800);
            }
        });

        button4 = (ImageButton) findViewById(R.id.button4);
        sound4 = MediaPlayer.create(this, R.raw.tuberia);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound4.start();
                button4.setColorFilter(Color.argb(75, 255,35,241));
                button4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button4.setColorFilter(Color.argb(255, 225,35,241));
                    }
                }, 1000);
            }
        });

        button5 = (ImageButton) findViewById(R.id.button5);
        sound5 = MediaPlayer.create(this, R.raw.vida);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound5.start();
                button5.setColorFilter(Color.argb(75, 255,27,47));
                button5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button5.setColorFilter(Color.argb(255, 255,27,47));
                    }
                }, 1000);
            }
        });

        button6 = (ImageButton) findViewById(R.id.button6);
        sound6 = MediaPlayer.create(this, R.raw.woohoo);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound6.start();
                button6.setColorFilter(Color.argb(75, 182,17,237));
                button6.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button6.setColorFilter(Color.argb(255, 182,17,237));
                    }
                }, 1000);
            }
        });
    }
}