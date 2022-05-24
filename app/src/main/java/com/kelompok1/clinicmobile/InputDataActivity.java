package com.kelompok1.clinicmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class InputDataActivity extends AppCompatActivity {

    Spinner spinnerJenisKelamin, spinnerPilihanBerobat;
    public String sJK, sBerobat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

        final String[] pilihJenisKelamin = {
                "Laki - Laki",
                "Perempuan",
        };

        final String[] pilihanBerobat = {
                "Poli Umum",
                "Poli Gigi",
                "Poli Spesialis",
        };

        spinnerJenisKelamin = findViewById(R.id.spinner_jenis_kelamin);
        ArrayAdapter<CharSequence> adapterJenisKelamin = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pilihJenisKelamin);
        adapterJenisKelamin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJenisKelamin.setAdapter(adapterJenisKelamin);

        spinnerJenisKelamin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sJK = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerPilihanBerobat = findViewById(R.id.spinner_pilihan_berobat);
        ArrayAdapter<CharSequence> adapterPilihanBerobat = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pilihanBerobat);
        adapterPilihanBerobat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPilihanBerobat.setAdapter(adapterPilihanBerobat);

        spinnerPilihanBerobat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sBerobat = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}