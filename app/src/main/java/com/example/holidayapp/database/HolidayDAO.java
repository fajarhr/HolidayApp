package com.example.holidayapp.database;

import android.database.Cursor;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface HolidayDAO {
    @Insert
    void insertHoliday(HolidayModelDB holidayModelDB);

    @Update
    void updateHoliday(HolidayModelDB holidayModelDB);

    @Query("DELETE FROM holiday")
    void deleteAll();

    @Delete
    void deleteMovie(HolidayModelDB holidayModelDB);

    @Query("SELECT * FROM holiday ORDER BY date ASC")
    LiveData<List<HolidayModelDB>> getAll();

}
