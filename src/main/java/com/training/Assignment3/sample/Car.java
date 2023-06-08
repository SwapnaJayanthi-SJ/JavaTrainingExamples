package com.training.Assignment3.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car extends VehicleDetails {

    VehicleManagementSystem  vms = new VehicleManagementSystem();
	Scanner sc = new Scanner(System.in);
	
	List<String> car_licensePlate = new ArrayList<String>();
	List<String> car_make = new ArrayList<String>();
	List<String> car_model = new ArrayList<String>();
	//List<Integer> car_year = new ArrayList<Integer>();

	public void addVehicle() 
	{
		
		System.out.print("Enter the vehicle Id: ");
		setLicensePlate(sc.next());
		car_licensePlate.add(getLicensePlate());
		System.out.println("Vehicle Id is added successfully...");
		
		System.out.print("Enter the make: ");
		setMake(sc.next());
		car_make.add(getMake());
		System.out.println("Vehicle brand is added successfully... ");
		
		System.out.print("Enter the model: ");
		setModel(sc.next());
		car_model.add(getModel());
		System.out.println("Vehicle model is added successfully... ");
		
		/*
		 * System.out.print("Enter the year: "); setYear(sc.nextInt());
		 * car_year.add(getYear());
		 * System.out.println("Year is added successfully... ");
		 */
		
		
		
		System.out.println("cardetails"+car_licensePlate);
		System.out.println("maketails"+car_make);
		System.out.println("modeletails"+car_model);
		//System.out.println("year"+car_year);
		
	}
	public void updateVehicle() 
	{
	
	}


	public void removeVehicle()
	{

		
	}

}
