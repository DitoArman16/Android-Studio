package com.komputerkit.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etMasukan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load(){
        etMasukan = findViewById(R.id.etMasukan);
    }

    public void btnBarang(View view) {
        String barang = etMasukan.getText().toString();
        Intent intent = new Intent(this, Barang.class);
        intent.putExtra("ISI", barang);
        startActivity(intent);
    }

    public void btnPenjualan(View view) {
        String penjualan = etMasukan.getText().toString();
        Intent intent = new Intent(this, Penjualan.class);
        intent.putExtra("ISI", penjualan);
        startActivity(intent);
    }

    public void btnPembelian(View view) {
        String pembelian = etMasukan.getText().toString();
        Intent intent = new Intent(this, Pembelian.class);
        intent.putExtra("ISI", pembelian);
        startActivity(intent);
    }
}