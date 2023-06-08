package com.training.Assignment3.VehicleManagementSystem;

public class Bicycle extends VehicleDetails
{
	public Bicycle() {
		this.setLicensePlate(licensePlate);
		this.setMake(make);
		this.setModel(model);
		this.setAvailable(true);
	}

	public void ringBell()
	{
		System.out.println("Ring! Ring! The bicycle bell is ringing!");
	}

	@Override
	public String toString() 
	{
		return "Bicycle [licensePlate=" + licensePlate + ", make=" + make + ", model=" + model + "]";
	}
}
