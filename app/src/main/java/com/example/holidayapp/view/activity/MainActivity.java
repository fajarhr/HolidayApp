package com.example.holidayapp.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.holidayapp.R;
import com.example.holidayapp.database.AppDatabase;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading = 4000;
    private AppDatabase appDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent goMain = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(goMain);
                finish();
            }
        } ,waktu_loading);
    }
}
