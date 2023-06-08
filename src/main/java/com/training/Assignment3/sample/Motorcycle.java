package com.training.Assignment3.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Motorcycle extends VehicleDetails{
	 VehicleManagementSystem  vms = new VehicleManagementSystem();
		Scanner sc = new Scanner(System.in);
		
		List<String> motor_licensePlate = new ArrayList<String>();
		List<String> motor_make = new ArrayList<String>();
		List<String> motor_model = new ArrayList<String>();
		//List<Integer> motor_year = new ArrayList<Integer>();
		
		
	
		public void addVehicle() 
		{
			System.out.print("Enter the vehicle Id: ");
			setLicensePlate(sc.next());
			motor_licensePlate.add(getLicensePlate());
			System.out.println("Vehicle Id is added successfully...");
			
			System.out.print("Enter the make: ");
			setMake(sc.next());
			motor_make.add(getMake());
			System.out.println("Vehicle brand is added successfully... ");
			
			System.out.print("Enter the model: ");
			setModel(sc.next());
			motor_model.add(getModel());
			System.out.println("Vehicle model is added successfully... ");
			
			/*
			 * System.out.print("Enter the year: "); setYear(sc.nextInt());
			 * motor_year.add(getYear());
			 * System.out.println("Year is added successfully... ");
			 */
			
			System.out.println("motordetails"+motor_licensePlate);
			System.out.println("maketails"+motor_make);
			System.out.println("modeletails"+motor_model);
		  // System.out.println("year"+motor_year);
			
		}

	
		public void updateVehicle() 
		{
		
		}


		public void removeVehicle()
		{

			
		}

}
