package com.komputerkit.recycleviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        IsiData();
    }

    public void load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void IsiData(){
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Tejo", "Surabaya"));
        siswaList.add(new Siswa("Eko", "Medan"));
        siswaList.add(new Siswa("Joni", "Sidoarjo"));
        siswaList.add(new Siswa("Bani", "Bandung"));
        siswaList.add(new Siswa("Danang", "Semarang"));
        siswaList.add(new Siswa("Parji", "Sidoarjo"));
        siswaList.add(new Siswa("Siypa", "Surabaya"));
        siswaList.add(new Siswa("Pinta", "Malang"));
        siswaList.add(new Siswa("Bae", "Jakarta"));
        siswaList.add(new Siswa("Rekt", "Jakarta"));
        siswaList.add(new Siswa("Oura", "Medan"));
        siswaList.add(new Siswa("Lemon", "Jakarta"));
        siswaList.add(new Siswa("Liam", "Jakarta"));

        adapter = new SiswaAdapter(this, siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("Sannoh", "Jepara"));
        adapter.notifyDataSetChanged();
    }
}