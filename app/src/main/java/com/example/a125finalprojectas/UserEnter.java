package com.example.a125finalprojectas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class UserEnter extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_enter);
        button = (Button) findViewById(R.id.StartGame);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });
    }
// button set to open game class
    public void openGame() {
        Intent intent = new Intent(this, NewGameActivity.class);
        startActivity(intent);
    }
    }
}
