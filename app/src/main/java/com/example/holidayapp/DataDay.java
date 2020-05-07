package com.example.holidayapp;

import java.util.ArrayList;

public class DataDay {
    private static String[] tgl_january = new String[]{"01", "07", "11", "13", "17", "20"};
    private static String[] hari_january = new String[]{"Hari Raya Idul Fitri", "Hari Buruh", "Hari H", "Hari ini", "Hari Jadian", "Hari Putus"};

    public static ArrayList<ModelDay> getListJanuary(){
        ModelDay modelDay = null;
        ArrayList<ModelDay> list = new ArrayList<>();
        for (int i=0; i <tgl_january.length; i++){
            modelDay = new ModelDay();
            modelDay.setTgl(tgl_january[i]);
            modelDay.setHari(hari_january[i]);
            list.add(modelDay);
        }
        return list;
    }
}
