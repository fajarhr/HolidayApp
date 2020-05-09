package com.example.holidayapp.service;

import com.example.holidayapp.model.HolidayResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HolidayRepository {
    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=1")
    Call<HolidayResponse>getHoliday();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=2")
    Call<HolidayResponse>getHoliday2();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=3")
    Call<HolidayResponse>getHoliday3();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=4")
    Call<HolidayResponse>getHoliday4();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=5")
    Call<HolidayResponse>getHoliday5();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=6")
    Call<HolidayResponse>getHoliday6();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=7")
    Call<HolidayResponse>getHoliday7();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=8")
    Call<HolidayResponse>getHoliday8();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=9")
    Call<HolidayResponse>getHoliday9();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=10")
    Call<HolidayResponse>getHoliday10();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=11")
    Call<HolidayResponse>getHoliday11();

    @GET("holidays?pretty&key=2cd04e36-642a-43bd-ab81-4de23222c16f&country=ID&year=2019&month=12")
    Call<HolidayResponse>getHoliday12();
}
