package com.mdp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    private EditText etNPM, etNama;
    private RadioButton rbjk;
    private RadioGroup rgJK;
    private Spinner spProdi;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNPM = findViewById(R.id.et_npm);
        etNama = findViewById(R.id.et_nama);
        rgJK = findViewById(R.id.rg_jk);
        spProdi = findViewById(R.id.sp_prodi);

        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String npm, nama, jk, prodi;
                int SelectedID;

                npm = etNPM.getText().toString();
                nama = etNama.getText().toString();
                prodi = spProdi.getSelectedItem().toString();

                SelectedID = rgJK.getCheckedRadioButtonId();
                rbjk = findViewById(SelectedID);
                jk = rbjk.getText().toString();

                if (npm.trim().equals(""))
                {
                    etNPM.setError("NPM Tidak Boleh Kosong!");
                }
                else if (nama.trim().equals(""))
                {
                    etNama.setError("Nama Tidak Boleh Kosong!");
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("varNPM", npm);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varJK", jk);
                    intent.putExtra("varProdi", prodi);
                    startActivity(intent);
                }
            }
        });
    }
}