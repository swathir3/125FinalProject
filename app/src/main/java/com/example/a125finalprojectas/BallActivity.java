package com.example.a125finalprojectas;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MotionEvent;

public class BallActivity extends AppCompatActivity {

    Bouncingball bbview;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bbview = new Bouncingball(this);
        setContentView(bbview);
        bbview.setBackgroundColor(Color.BLACK);
    }
}