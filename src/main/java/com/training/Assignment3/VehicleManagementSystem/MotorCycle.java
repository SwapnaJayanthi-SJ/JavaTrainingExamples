package com.training.Assignment3.VehicleManagementSystem;

public class MotorCycle extends VehicleDetails
{
	public void startEngine() 
	{
		System.out.println("Starting the motorcycle engine.");
	}

	@Override
	public String toString() 
	{
		return "MotorCycle [licensePlate=" + licensePlate + ", make=" + make + ", model=" + model + "]";
	}

}
