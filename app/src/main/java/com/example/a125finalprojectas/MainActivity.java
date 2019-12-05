package com.example.a125finalprojectas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.CountDownTimer;
import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button myButton;
    private SoundPlayer sound;
    Bouncingball bbview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sound = new SoundPlayer(this);
        myButton = findViewById(R.id.StartGame);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });
    }
    // button set to open game class
    public void openGame() {
        bbview = new Bouncingball(this);
        setContentView(bbview);
        bbview.setBackgroundColor(Color.BLACK);
        touchCheck();
        /*Intent intent = new Intent(this, BallActivity.class);
        startActivity(intent);
        finish();*/
    }
    public void touchCheck() {
        //set sound to geoff heads and incorrect heads
        //are objects of view
        bbview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playRightSound();
            }
        });
    }
}
