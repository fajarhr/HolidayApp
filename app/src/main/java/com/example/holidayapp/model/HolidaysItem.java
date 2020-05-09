package com.example.holidayapp.model;

public class HolidaysItem{
	private String date;
	private String country;
	private boolean jsonMemberPublic;
	private String name;
	private Weekday weekday;
	private String uuid;
	private String observed;
//	private Integer index;
//
//	public Integer getIndex(){
////		for (int i = 1; i <= getDate().length(); i++){
////			index="0"+i;
////		}
//		index.toString(getCountry().length());
//		return index;
//	}

	public String getDate(){
		return date;
	}

	public String getCountry(){
		return country;
	}

	public boolean isJsonMemberPublic(){
		return jsonMemberPublic;
	}

	public String getName(){
		return name;
	}

	public Weekday getWeekday(){ return weekday; }

	public String getUuid(){
		return uuid;
	}

	public String getObserved(){
		return observed;
	}
}
