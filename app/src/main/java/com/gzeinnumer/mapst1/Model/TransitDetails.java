package com.gzeinnumer.mapst1.Model;

import com.google.gson.annotations.SerializedName;

    public class TransitDetails{

	@SerializedName("headsign")
	private String headsign;

	@SerializedName("arrival_time")
	private ArrivalTime arrivalTime;

	@SerializedName("line")
	private Line line;

	@SerializedName("num_stops")
	private int numStops;

	@SerializedName("arrival_stop")
	private ArrivalStop arrivalStop;

	@SerializedName("departure_stop")
	private DepartureStop departureStop;

	@SerializedName("headway")
	private int headway;

	@SerializedName("departure_time")
	private DepartureTime departureTime;

	public void setHeadsign(String headsign){
		this.headsign = headsign;
	}

	public String getHeadsign(){
		return headsign;
	}

	public void setArrivalTime(ArrivalTime arrivalTime){
		this.arrivalTime = arrivalTime;
	}

	public ArrivalTime getArrivalTime(){
		return arrivalTime;
	}

	public void setLine(Line line){
		this.line = line;
	}

	public Line getLine(){
		return line;
	}

	public void setNumStops(int numStops){
		this.numStops = numStops;
	}

	public int getNumStops(){
		return numStops;
	}

	public void setArrivalStop(ArrivalStop arrivalStop){
		this.arrivalStop = arrivalStop;
	}

	public ArrivalStop getArrivalStop(){
		return arrivalStop;
	}

	public void setDepartureStop(DepartureStop departureStop){
		this.departureStop = departureStop;
	}

	public DepartureStop getDepartureStop(){
		return departureStop;
	}

	public void setHeadway(int headway){
		this.headway = headway;
	}

	public int getHeadway(){
		return headway;
	}

	public void setDepartureTime(DepartureTime departureTime){
		this.departureTime = departureTime;
	}

	public DepartureTime getDepartureTime(){
		return departureTime;
	}
}