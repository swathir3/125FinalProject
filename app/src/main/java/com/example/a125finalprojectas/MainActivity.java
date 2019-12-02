package com.example.a125finalprojectas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button myButton;
    Bouncingball bbview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        /*Intent intent = new Intent(this, BallActivity.class);
        startActivity(intent);
        finish();*/
    }
}
