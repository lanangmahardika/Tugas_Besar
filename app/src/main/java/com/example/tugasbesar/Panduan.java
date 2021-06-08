package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class Panduan extends AppCompatActivity {
    Button btkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan);

        btkembali = (Button) findViewById(R.id.btkembali);

        btkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btkembali = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(btkembali);
               Panduan.this.finish();

            }
        });
    }
}