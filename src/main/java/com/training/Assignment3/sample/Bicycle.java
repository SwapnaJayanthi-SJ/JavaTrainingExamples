package com.training.Assignment3.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bicycle extends VehicleDetails 
{
	 VehicleManagementSystem  vms = new VehicleManagementSystem();
		Scanner sc = new Scanner(System.in);
		
		List<String> bicycle_licensePlate = new ArrayList<String>();
		List<String> bicycle_make = new ArrayList<String>();
		List<String> bicycle_model = new ArrayList<String>();
		//List<Integer> bicycle_year = new ArrayList<Integer>();
		
	
		public void addVehicle() 
		{
			System.out.print("Enter the vehicle Id: ");
			setLicensePlate(sc.next());
			bicycle_licensePlate.add(getLicensePlate());
			System.out.println("Vehicle Id is added successfully...");
			
			System.out.print("Enter the make: ");
			setMake(sc.next());
			bicycle_make.add(getMake());
			System.out.println("Vehicle brand is added successfully... ");
			
			System.out.print("Enter the model: ");
			setModel(sc.next());
			bicycle_model.add(getModel());
			System.out.println("Vehicle model is added successfully... ");
			
			/*
			 * System.out.print("Enter the year: "); setYear(sc.nextInt());
			 * bicycle_year.add(getYear());
			 * System.out.println("Year is added successfully... ");
			 */
			
			System.out.println("bicycledetails"+bicycle_licensePlate);
			System.out.println("maketails"+bicycle_make);
			System.out.println("modeletails"+bicycle_model);
			//System.out.println("year"+bicycle_year);
			
		}

		public void updateVehicle() 
		{
		
		}

	
		public void removeVehicle()
		{

			
		}

}
