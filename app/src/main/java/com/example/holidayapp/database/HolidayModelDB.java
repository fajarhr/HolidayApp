package com.example.holidayapp.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "holiday")
public class HolidayModelDB {
    @ColumnInfo(name = "date")
    private String date;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "name")
    private double name;

    @ColumnInfo(name = "country")
    private int country;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }
}
