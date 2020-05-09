package com.example.holidayapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {HolidayModelDB.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static  AppDatabase appDatabase;
   // private abstract HolidayDAO holidayDAO();

    public static AppDatabase initDatabase(Context context){
        if (appDatabase == null) {
            appDatabase = Room.databaseBuilder(
                    context,
                    AppDatabase.class,
                    "holiday"
            ).allowMainThreadQueries().build();

        }
        return appDatabase;

    }
}

