package com.example.a125finalprojectas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.CountDownTimer;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static final long START_TIME = 30000;
    private TextView CountDown;
    private Button myButton;
    private SoundPlayer sound;
    private CountDownTimer myCountDownTimer;
    private boolean myTimerRunning;
    private long myTimeLeft = START_TIME;
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
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });
        CountDown = findViewById(R.id.text_view_countdown);
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
    public void startTimer() {
        myCountDownTimer = new CountDownTimer(myTimeLeft, 1000) {
            @Override
            public void onTick(long sUntilFinished) {
                myTimeLeft = sUntilFinished;
                CountDown.setText("timer " + sUntilFinished / 1000);
            }
            public void onFinish() {
                CountDown.setText("game over");
            }
        }.start();
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
