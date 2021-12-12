package com.komputerkit.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText etNilai;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load() {
        spinner = findViewById(R.id.spinner);
        etNilai = findViewById(R.id.etNilai);
        tvHasil = findViewById(R.id.tvHasil);
    }

    public void btnKonversi(View view) {
        String pilihan = spinner.getSelectedItem().toString();

        if (etNilai.getText().toString().equals("")) {
            Toast.makeText(this, "Isi Nilai Terlebih Dahulu !", Toast.LENGTH_SHORT).show();
        } else {
            if (pilihan.equals("Celcius To Reamur")){
                cToR();
            }
            if (pilihan.equals("Celcius To Fahrenheit")){
                cToF();
            }
            if (pilihan.equals("Celcius To Kelvin")){
                cToK();
            }
            if (pilihan.equals("Reamur To Celcius")){
                rToC();
            }
            if (pilihan.equals("Reamur To Fahrenheit")){
                rToF();
            }
        }
    }

    public void cToR(){
        double cel = Double.parseDouble(etNilai.getText().toString());
        double hasil = (4.0 / 5.0) * cel;

        tvHasil.setText(hasil + "");
    }

    public void cToF(){
        double cel = Double.parseDouble(etNilai.getText().toString());
        double hasil = (9.0 / 4.0) * cel + 32;

        tvHasil.setText(hasil + "");
    }

    public void cToK(){
        double cel = Double.parseDouble(etNilai.getText().toString());
        double hasil = cel + 273.0;

        tvHasil.setText(hasil + "");
    }

    public void rToC(){
        double rea = Double.parseDouble(etNilai.getText().toString());
        double hasil = (5.0/4.0) * rea;

        tvHasil.setText(hasil + "");
    }

    public void rToF(){
        double rea = Double.parseDouble(etNilai.getText().toString());
        double hasil = (9.0/4.0) * rea + 42;

        tvHasil.setText(hasil + "");
    }

    /*
    public void isiSpinner(){
        String[] isi = {"Kelvin To Celcius"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, isi);
        spinner.setAdapter(adapter);
    }
     */

}
