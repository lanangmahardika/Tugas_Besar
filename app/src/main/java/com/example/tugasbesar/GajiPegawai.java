    package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class GajiPegawai extends AppCompatActivity {
    private EditText ednik, ednama, edgapok, edtunjab , edhari, edtm, edtt, edgakot , edgaber;
    private Button bthitung, btkembali ;
    Double vnik, vgapok, vtunjab, vhari, vtm, vtt, vgakot, vgaber ;
    String vnama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji_pegawai);
        ednik = (EditText)findViewById(R.id.ednik);
        ednama = (EditText)findViewById(R.id.ednama);
        edgapok = (EditText)findViewById(R.id.edgapok);
        edtunjab = (EditText)findViewById(R.id.edtunjab);
        edhari = (EditText)findViewById(R.id.edhari);
        edtm = (EditText)findViewById(R.id.edtm);
        edtt = (EditText)findViewById(R.id.edtt);
        edgakot = (EditText)findViewById(R.id.edgakot);
        edgaber = (EditText)findViewById(R.id.edgaber);
        bthitung = (Button) findViewById(R.id.bthitung);
        btkembali = (Button) findViewById(R.id.btkembali);



    }

    public void Hitung(View view) {
        vnik = Double.parseDouble(ednik.getText().toString());
        vgapok = Double.parseDouble(edgapok.getText().toString());
        vtunjab = Double.parseDouble(edtunjab.getText().toString());
        vhari = Double.parseDouble(edhari.getText().toString());

        vtm = vhari * 10000;
        vtt = vhari * 5000;
        vgakot = vgapok + vtunjab + vtm + vtt ;
        vgaber = vgakot - (0.1);

        edtm.setText("" + vtm);
        edtt.setText("" + vtt);
        edgakot.setText("" + vgakot);
        edgaber.setText("" + vgaber);

    }

    public void Kembali(View view) {
        Intent kembali = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(kembali);
    }



}