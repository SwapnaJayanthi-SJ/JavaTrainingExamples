package com.training.Assignment3.VehicleManagementSystem;

public class Car extends VehicleDetails
{
	public Car() 
	{
		this.setLicensePlate(licensePlate);
		this.setMake(make);
		this.setModel(model);
		this.setAvailable(true);
	}

	@Override
	public String toString()
	{
		return "Car [licensePlate=" + licensePlate + ", make=" + make + ", model=" + model + "]";
	}
}
