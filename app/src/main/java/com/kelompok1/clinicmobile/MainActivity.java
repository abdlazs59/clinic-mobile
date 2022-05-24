package com.kelompok1.clinicmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnInputData = (Button) findViewById(R.id.btnInputData);
        btnInputData.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, ShowPasienActivity.class);
            startActivity(intent);
        }));

        Button btnLihatData = (Button) findViewById(R.id.btnLihatData);
        btnLihatData.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, ResultPasienActivity.class);
            startActivity(intent);
        }));

        Button btnInfo = (Button) findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        }));
    }
}