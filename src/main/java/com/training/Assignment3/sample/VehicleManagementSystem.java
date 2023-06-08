package com.training.Assignment3.sample;

import java.util.Scanner;
public class VehicleManagementSystem 
{
	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		VehicleManagementSystem  VehicleManagementSystem  = null;
		int choice = 0;
		int vehicle = 0;
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Motorcycle motor = new Motorcycle();
		VehicleDetails details = new VehicleDetails();

		do
		{
			
			if(VehicleManagementSystem ==null)
			{
				System.out.println("Vehicle Rental Management System");
				System.out.println("1.Add Vehicle");
				System.out.println("2.List Available vehicles");
				System.out.println("3.Rent a vehicle");
				System.out.println("4.Calculate rental cost");
				System.out.println("5.Return vehicle");
				System.out.println("6.Quit");
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					car.addVehicle();
					break;
				case 2:
					bicycle.addVehicle();
					break;
				case 3:
					motor.addVehicle();
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;

				default:
					System.out.println("Invalid option");
				}
			}
		}
		while(choice!=3);
		System.out.println("Thank you for using our service, Please visit again...");
		sc.close();



	}


}
