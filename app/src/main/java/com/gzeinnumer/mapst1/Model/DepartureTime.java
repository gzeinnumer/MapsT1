package com.gzeinnumer.mapst1.Model;

import com.google.gson.annotations.SerializedName;

    public class DepartureTime{

	@SerializedName("text")
	private String text;

	@SerializedName("time_zone")
	private String timeZone;

	@SerializedName("value")
	private int value;

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setTimeZone(String timeZone){
		this.timeZone = timeZone;
	}

	public String getTimeZone(){
		return timeZone;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}
}