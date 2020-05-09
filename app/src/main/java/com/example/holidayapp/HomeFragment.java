package com.example.holidayapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private CardView cvJanuary, cvFebruary, cvMarch, cvApril, cvMay, cvJune, cvJuly, cvJuny, cvAugust, cvSeptember, cvOctober, cvNovember, cvDecember;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        cvJanuary = view.findViewById(R.id.cv_januari);
        cvFebruary = view.findViewById(R.id.cv_february);
        cvMarch = view.findViewById(R.id.cv_march);
        cvApril = view.findViewById(R.id.cv_april);
        cvMay = view.findViewById(R.id.cv_may);
        cvJune = view.findViewById(R.id.cv_june);
        cvJuly = view.findViewById(R.id.cv_july);
        cvAugust = view.findViewById(R.id.cv_august);
        cvSeptember = view.findViewById(R.id.cv_september);
        cvOctober = view.findViewById(R.id.cv_october);
        cvNovember = view.findViewById(R.id.cv_november);
        cvDecember = view.findViewById(R.id.cv_december);
        addListenerOnButton();
        return view;
    }

    private void addListenerOnButton() {
       cvJanuary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "January");
                startActivity(i);
            }
        });
        cvFebruary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "February");
                startActivity(i);
            }
        });
        cvMarch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "March");
                startActivity(i);
            }
        });
        cvApril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "April");
                startActivity(i);
            }
        });
        cvMay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "May");
                startActivity(i);
            }
        });
        cvJune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "June");
                startActivity(i);
            }
        });
        cvJuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "July");
                startActivity(i);
            }
        });
        cvAugust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "August");
                startActivity(i);
            }
        });
        cvSeptember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "September");
                startActivity(i);
            }
        });
        cvOctober.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "October");
                startActivity(i);
            }
        });
        cvNovember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "November");
                startActivity(i);
            }
        });
        cvDecember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DayActivity.class);
                i.putExtra("mounth", "December");
                startActivity(i);
            }
        });





    }

}
