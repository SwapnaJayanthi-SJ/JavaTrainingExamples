package com.training.Assignment3.sample;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalService implements RentalCostCalculator
{
	private List<VehicleDetails> vehicles;
    private List<Rental> rentals;
    
    public List<VehicleDetails> getAvailableVehicles() 
    {
		return vehicles;
      
    }
    
    public Rental rentVehicle(CustomerDetails customer, VehicleDetails vehicle, LocalDateTime startTime, LocalDateTime endTime) 
    {
		return null;
     
    }
    
    
    Scanner sc = new Scanner(System.in);
    int vehicle = 0;
    
    List<String> car_licensePlate = new ArrayList<String>();
	List<String> car_make = new ArrayList<String>();
	List<String> car_model = new ArrayList<String>();
	
	List<String> bicycle_licensePlate = new ArrayList<String>();
	List<String> bicycle_make = new ArrayList<String>();
	List<String> bicycle_model = new ArrayList<String>();
	
	List<String> motor_licensePlate = new ArrayList<String>();
	List<String> motor_make = new ArrayList<String>();
	List<String> motor_model = new ArrayList<String>();
	
	public void addItem() 
	{ 
		do
	  {
         System.out.println("Which type of vachile you want to add");
         System.out.println("1.Car");
         System.out.println("2.Bicycle");
         System.out.println("3.motorcycle");
         System.out.println("4.Quit");
         vehicle = sc.nextInt();
            switch(vehicle)
           {
            case 1:
                Car car=new Car();
                car.addVehicle();
                car_licensePlate.add(car.getLicensePlate());
                car_make.add(car.getMake());
                car_model.add(car.getModel());
                System.out.println("Car details added successfully...");
                break;
                
             case 2:
                Bicycle bicycle=new Bicycle();
                bicycle.addVehicle();
                bicycle_licensePlate.add(bicycle.getLicensePlate());
                bicycle_make.add(bicycle.getMake());
                bicycle_model.add(bicycle.getModel());
                System.out.println("Bicycle details added successfully...");
                break;
                
            case 3:
                Motorcycle motorcycle=new Motorcycle();
                motorcycle.addVehicle();
                motor_licensePlate.add(motorcycle.getLicensePlate());
                motor_make.add(motorcycle.getMake());
                motor_model.add(motorcycle.getModel());
                System.out.println("Motorcycle details added successfully...");
                break;
           case 4:
              System.out.println("Quit: ");
                break;

          default:
             System.out.println("Invalid option");    
            }
    }



    while(vehicle!=4);



    System.out.println("Thank you for adding vechiles...");



   }
}
