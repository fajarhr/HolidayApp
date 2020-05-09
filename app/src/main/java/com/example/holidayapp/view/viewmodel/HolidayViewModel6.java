package com.example.holidayapp.view.viewmodel;

import com.example.holidayapp.model.HolidayResponse;
import com.example.holidayapp.model.HolidaysItem;
import com.example.holidayapp.service.ApiMain;

import java.util.ArrayList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HolidayViewModel6 extends ViewModel {
    private ApiMain apiMain;
    private MutableLiveData<ArrayList<HolidaysItem>> listHoliday = new MutableLiveData();

    public void setListHoliday(){
        if(this.apiMain==null){
            apiMain = new ApiMain();
        }

        apiMain.getApiHoliday().getHoliday6().enqueue(new Callback<HolidayResponse>() {
            @Override
            public void onResponse(Call<HolidayResponse> call, Response<HolidayResponse> response) {
                HolidayResponse responseHoliday = response.body();
                if (responseHoliday !=null && responseHoliday.getHolidays()!=null){
                    ArrayList<HolidaysItem> holidaysItems = responseHoliday.getHolidays();
                    listHoliday.postValue(holidaysItems);
                }
            }

            @Override
            public void onFailure(Call<HolidayResponse> call, Throwable t) {

            }
        });
    }

    public LiveData<ArrayList<HolidaysItem>> getHoliday(){
        return listHoliday;
    }

}
