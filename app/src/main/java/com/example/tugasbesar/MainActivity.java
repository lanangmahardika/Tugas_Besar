package com.example.tugasbesar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
 
    private ImageView button,button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (ImageView)findViewById(R.id.button);
        button1 = (ImageView)findViewById(R.id.button1);
        button2 = (ImageView)findViewById(R.id.button2);
        button3 = (ImageView)findViewById(R.id.button3);

        button.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(), GajiPegawai.class);
            startActivity(intent1);
        });
        button1.setOnClickListener(v -> {
            Intent intent2 = new Intent(getApplicationContext(), Panduan.class);
            startActivity(intent2);
        });
        button2.setOnClickListener(v -> {
            Intent intent3 = new Intent(getApplicationContext(), Tentang.class);
            startActivity(intent3);
        });
        button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v){
                moveTaskToBack( true);
                finish();
                System.exit( 0);
            }

        });


    }
}