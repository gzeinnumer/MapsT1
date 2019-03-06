package com.gzeinnumer.mapst1.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

    public class Line{

	@SerializedName("color")
	private String color;

	@SerializedName("name")
	private String name;

	@SerializedName("agencies")
	private List<AgenciesItem> agencies;

	@SerializedName("short_name")
	private String shortName;

	@SerializedName("text_color")
	private String textColor;

	@SerializedName("vehicle")
	private Vehicle vehicle;

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAgencies(List<AgenciesItem> agencies){
		this.agencies = agencies;
	}

	public List<AgenciesItem> getAgencies(){
		return agencies;
	}

	public void setShortName(String shortName){
		this.shortName = shortName;
	}

	public String getShortName(){
		return shortName;
	}

	public void setTextColor(String textColor){
		this.textColor = textColor;
	}

	public String getTextColor(){
		return textColor;
	}

	public void setVehicle(Vehicle vehicle){
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle(){
		return vehicle;
	}
}