package com.example.holidayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DayActivity extends AppCompatActivity {

    private TextView tvMounth;
    private RecyclerView rvDay;
    private ArrayList<ModelDay> listDay = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        getSupportActionBar().hide();

        tvMounth = findViewById(R.id.tvMounth);
        String text = getIntent().getStringExtra("mounth");
        tvMounth.setText(text);
        
        rvDay = findViewById(R.id.dayList);
        rvDay.setHasFixedSize(true);
        if (text.equals("January"))
            listDay.addAll(DataDay.getListJanuary());
        showRecycler();
    }

    private void showRecycler() {
        rvDay.setLayoutManager(new LinearLayoutManager(this));
        AdapterDay adapterDay = new AdapterDay(listDay);
        adapterDay.setListDay(listDay);
        rvDay.setAdapter(adapterDay);
    }
}
