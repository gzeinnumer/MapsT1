package com.gzeinnumer.mapst1.Model;

import com.google.gson.annotations.SerializedName;

    public class DepartureStop{

	@SerializedName("name")
	private String name;

	@SerializedName("location")
	private Location location;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}
}