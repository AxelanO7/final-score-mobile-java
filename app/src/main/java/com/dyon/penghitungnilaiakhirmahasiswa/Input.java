package com.dyon.penghitungnilaiakhirmahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Input extends AppCompatActivity {
    Button btnHitung;
    EditText etNama, etTugas, etUTS, etUAS;
    static Integer nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    static String nama = "", huruf = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        etNama = findViewById(R.id.etInput1);
        etTugas = findViewById(R.id.etInput2);
        etUTS = findViewById(R.id.etInput3);
        etUAS = findViewById(R.id.etInput4);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(v -> {
            nama = etNama.getText().toString();
            nilaiTugas = Integer.parseInt(etTugas.getText().toString()) * 20 / 100;
            nilaiUTS = Integer.parseInt(etUTS.getText().toString()) * 30 / 100;
            nilaiUAS = Integer.parseInt(etUAS.getText().toString()) * 50 / 100;
            nilaiAkhir = nilaiTugas + nilaiUTS + nilaiUAS;
            if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
                huruf = "A";
            } else if (nilaiAkhir >= 71 && nilaiAkhir < 85) {
                huruf = "B";
            } else if (nilaiAkhir >= 55 && nilaiAkhir < 71) {
                huruf = "C";
            } else if (nilaiAkhir >= 41 && nilaiAkhir < 55) {
                huruf = "D";
            } else {
                huruf = "E";
            }
            Intent intent = new Intent(Input.this, Output.class);
            startActivity(intent);
        });


    }
}
