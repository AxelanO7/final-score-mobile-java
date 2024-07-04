package com.dyon.penghitungnilaiakhirmahasiswa;

import static com.dyon.penghitungnilaiakhirmahasiswa.Input.huruf;
import static com.dyon.penghitungnilaiakhirmahasiswa.Input.nama;
import static com.dyon.penghitungnilaiakhirmahasiswa.Input.nilaiAkhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Output extends AppCompatActivity {
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        tvHasil = findViewById(R.id.tvOutput1);
        tvHasil.setText("Nama : " + nama + "\nNilai Akhir : " + nilaiAkhir + "\nNilai Huruf : " + huruf);
    }
}
