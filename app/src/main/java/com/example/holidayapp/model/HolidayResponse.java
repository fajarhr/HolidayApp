package com.example.holidayapp.model;

import java.util.ArrayList;
import java.util.List;

public class HolidayResponse{
	private ArrayList<HolidaysItem> holidays;
	private String warning;
	private Requests requests;
	private int status;

	public ArrayList<HolidaysItem> getHolidays(){
		return holidays;
	}

	public String getWarning(){
		return warning;
	}

	public Requests getRequests(){
		return requests;
	}

	public int getStatus(){
		return status;
	}
}