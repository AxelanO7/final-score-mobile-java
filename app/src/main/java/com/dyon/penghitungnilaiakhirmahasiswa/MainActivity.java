package com.dyon.penghitungnilaiakhirmahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btnWelcome);

        btnStart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Input.class);
            MainActivity.this.startActivity(intent);
            finish();
        });
    }
}
