package com.example.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNilaiA, editNilaiB;

    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNilaiA = (EditText) findViewById(R.id.editNilaiA);
        editNilaiB = (EditText) findViewById(R.id.editNilaiB);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());

                int hasil = nilaiA + nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());

                int hasil = nilaiA - nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());

                int hasil = nilaiA * nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());

                int hasil = nilaiA / nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });



    }
}