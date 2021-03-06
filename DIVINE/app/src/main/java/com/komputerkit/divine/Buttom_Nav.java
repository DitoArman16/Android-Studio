package com.komputerkit.divine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Buttom_Nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom_nav);

        BottomNavigationView navview = findViewById(R.id.bottom_nav);
        navview.setItemIconTintList(null);

        navview.setSelectedItemId(R.id.home);

        navview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                        ,home.class));
                        overridePendingTransition(0, 0);
                         return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext()
                        ,username.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}