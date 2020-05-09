package com.example.holidayapp.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.holidayapp.R;
import com.example.holidayapp.adapter.HolidayAdapter;
import com.example.holidayapp.model.HolidaysItem;
import com.example.holidayapp.view.viewmodel.HolidayViewModel;
import com.example.holidayapp.view.viewmodel.HolidayViewModel2;
import com.example.holidayapp.view.viewmodel.HolidayViewModel4;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemFragment4 extends Fragment {
    private HolidayAdapter holidayAdapter;
    private HolidayViewModel4 holidayViewModel;
    private RecyclerView rvHoliday;

    public ItemFragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("ItemFragment4", "OnCreateView");
        return inflater.inflate(R.layout.fragment_item, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        holidayAdapter = new HolidayAdapter(getContext());
        holidayAdapter.notifyDataSetChanged();
        rvHoliday = view.findViewById(R.id.fragment_holiday_rv);
        rvHoliday.setLayoutManager(new GridLayoutManager(getContext(), 1));
        holidayViewModel = new ViewModelProvider(this).get(HolidayViewModel4.class);

        holidayViewModel.setListHoliday();
        holidayViewModel.getHoliday().observe(getViewLifecycleOwner(), getHoliday);
        rvHoliday.setAdapter(holidayAdapter);
    }

    private Observer<ArrayList<HolidaysItem>> getHoliday = new Observer<ArrayList<HolidaysItem>>() {
        @Override
        public void onChanged(ArrayList<HolidaysItem> holidaysItems) {
            if (holidaysItems != null) {
                holidayAdapter.setData(holidaysItems);
            }
        }
    };

}