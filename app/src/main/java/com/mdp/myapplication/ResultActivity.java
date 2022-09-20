package com.mdp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tvNPM, tvNama, tvProdi, tvJK;

    @Override
    protected void onCreate (Bundle savedIntanceState)
    {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_result);

        tvNPM = findViewById(R.id.tv_npm);
        tvNama = findViewById(R.id.tv_nama);
        tvJK = findViewById(R.id.tv_jk);
        tvProdi = findViewById(R.id.tv_prodi);

        Intent intent = getIntent();
        tvNPM.setText(intent.getStringExtra("varNPM"));
        tvNama.setText(intent.getStringExtra("varNama"));
        tvProdi.setText(intent.getStringExtra("varJK"));
        tvJK.setText(intent.getStringExtra("varProdi"));

    }

}
