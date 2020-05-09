package com.example.holidayapp.view.fragment;


import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.holidayapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        CardView cv_jan = (CardView) view.findViewById(R.id.cv_januari);
        cv_jan.setOnClickListener(this);
        CardView cv_feb = (CardView) view.findViewById(R.id.cv_february);
        cv_feb.setOnClickListener(this);
        CardView cv_mar = (CardView) view.findViewById(R.id.cv_march);
        cv_mar.setOnClickListener(this);
        CardView cv_apr = (CardView) view.findViewById(R.id.cv_april);
        cv_apr.setOnClickListener(this);
        CardView cv_may = (CardView) view.findViewById(R.id.cv_may);
        cv_may.setOnClickListener(this);
        CardView cv_jun = (CardView) view.findViewById(R.id.cv_june);
        cv_jun.setOnClickListener(this);
        CardView cv_jul = (CardView) view.findViewById(R.id.cv_july);
        cv_jul.setOnClickListener(this);
        CardView cv_aug = (CardView) view.findViewById(R.id.cv_august);
        cv_aug.setOnClickListener(this);
        CardView cv_sep = (CardView) view.findViewById(R.id.cv_september);
        cv_sep.setOnClickListener(this);
        CardView cv_oct = (CardView) view.findViewById(R.id.cv_october);
        cv_oct.setOnClickListener(this);
        CardView cv_nov = (CardView) view.findViewById(R.id.cv_november);
        cv_nov.setOnClickListener(this);
        CardView cv_dec = (CardView) view.findViewById(R.id.cv_december);
        cv_dec.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (view.getId()) {
            case R.id.cv_januari:
                Fragment fragment = new ItemFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.cv_february:
                Fragment fragment2 = new ItemFragment2();
                FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                transaction2.replace(R.id.fragment_container, fragment2);
                transaction2.addToBackStack(null);
                transaction2.commit();
                break;
            case R.id.cv_march:
                Fragment fragment3 = new ItemFragment3();
                FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                transaction3.replace(R.id.fragment_container, fragment3);
                transaction3.addToBackStack(null);
                transaction3.commit();
                break;
            case R.id.cv_april:
                Fragment fragment4 = new ItemFragment4();
                FragmentTransaction transaction4 = getFragmentManager().beginTransaction();
                transaction4.replace(R.id.fragment_container, fragment4);
                transaction4.addToBackStack(null);
                transaction4.commit();
                break;
            case R.id.cv_may:
                Fragment fragment5 = new ItemFragment5();
                FragmentTransaction transaction5 = getFragmentManager().beginTransaction();
                transaction5.replace(R.id.fragment_container, fragment5);
                transaction5.addToBackStack(null);
                transaction5.commit();
                break;
            case R.id.cv_june:
                Fragment fragment6 = new ItemFragment6();
                FragmentTransaction transaction6 = getFragmentManager().beginTransaction();
                transaction6.replace(R.id.fragment_container, fragment6);
                transaction6.addToBackStack(null);
                transaction6.commit();
                break;
            case R.id.cv_july:
                Fragment fragment7 = new ItemFragment7();
                FragmentTransaction transaction7 = getFragmentManager().beginTransaction();
                transaction7.replace(R.id.fragment_container, fragment7);
                transaction7.addToBackStack(null);
                transaction7.commit();
                break;
            case R.id.cv_august:
                Fragment fragment8 = new ItemFragment8();
                FragmentTransaction transaction8 = getFragmentManager().beginTransaction();
                transaction8.replace(R.id.fragment_container, fragment8);
                transaction8.addToBackStack(null);
                transaction8.commit();
                break;
            case R.id.cv_september:
                Fragment fragment9 = new ItemFragment9();
                FragmentTransaction transaction9 = getFragmentManager().beginTransaction();
                transaction9.replace(R.id.fragment_container, fragment9);
                transaction9.addToBackStack(null);
                transaction9.commit();
                break;
            case R.id.cv_october:
                Fragment fragment10 = new ItemFragment10();
                FragmentTransaction transaction10 = getFragmentManager().beginTransaction();
                transaction10.replace(R.id.fragment_container, fragment10);
                transaction10.addToBackStack(null);
                transaction10.commit();
                break;
            case R.id.cv_november:
                Fragment fragment11 = new ItemFragment11();
                FragmentTransaction transaction11 = getFragmentManager().beginTransaction();
                transaction11.replace(R.id.fragment_container, fragment11);
                transaction11.addToBackStack(null);
                transaction11.commit();
                break;
            case R.id.cv_december:
                Fragment fragment12 = new ItemFragment12();
                FragmentTransaction transaction12 = getFragmentManager().beginTransaction();
                transaction12.replace(R.id.fragment_container, fragment12);
                transaction12.addToBackStack(null);
                transaction12.commit();
                break;
        }
    }
}
