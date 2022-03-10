package com.edureka;

import java.io.Serializable;

public class VehicleInfo implements Serializable{
	
	Integer numOfWheels;
	Integer mileage;
	String nameOfVehicle;
	
	VehicleInfo(String nameOfVehicle, Integer numOfWheels, Integer mileage){
		this.nameOfVehicle = nameOfVehicle;
		this.mileage = mileage;
		this.numOfWheels = numOfWheels;
	}

}
