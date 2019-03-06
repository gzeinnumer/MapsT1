package com.gzeinnumer.mapst1.Model;

import com.google.gson.annotations.SerializedName;

    public class AgenciesItem{

	@SerializedName("name")
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}