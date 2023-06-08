package com.training.Assignment3.VehicleManagementSystem;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class VehicleManagementSystem
{
	public static void main(String[] args) {
		RentalService rentalService = new RentalService();
		Scanner sc = new Scanner(System.in);

		int choice;
		do {
			System.out.println("VehicleRentalManagementSystem");
			System.out.println("1. Add Vehicle");
			System.out.println("2. List available vehicles");
			System.out.println("3. Rent a vehicle");
			System.out.println("4. Calculate a rental cost");
			System.out.println("5. Return a vehicle");
			System.out.println("6. Quit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.print("Vehicle Type (car/motorcycle/bicycle): ");
				String vehicleType = sc.next();

				VehicleDetails vehicles;
				if (vehicleType.equalsIgnoreCase("car")) {
					vehicles = new Car();
				} else if (vehicleType.equalsIgnoreCase("motorcycle")) {
					vehicles = new MotorCycle();
				} else if (vehicleType.equalsIgnoreCase("bicycle")) {
					vehicles = new Bicycle();
				} else {
					System.out.println("Invalid vehicle type.");
					break;
				}
				System.out.println("Enter vehicle details:");
				System.out.print("License Plate: ");
				String licensePlate = sc.next();
				System.out.print("Make: ");
				String make = sc.next();
				System.out.print("Model: ");
				String model = sc.next();
				vehicles.setLicensePlate(licensePlate);
				vehicles.setMake(make);
				vehicles.setModel(model);
				vehicles.setAvailable(true);

				rentalService.addVehicle(vehicles);
				System.out.println("Vehicle added successfully.");
				break;
			case 2:
				List<VehicleDetails> availableVehicles = rentalService.getAvailableVehicles();
				System.out.println("Available Vehicles:");
				for (VehicleDetails vehicless : availableVehicles) {
					System.out.println(vehicless);
				}
				break;
			case 3:
				// Rent a vehicle
				// Get customer information
				System.out.print("Enter customer's first name: ");
				String firstName = sc.next();
				System.out.print("Enter customer's last name: ");
				String lastName = sc.next();
				System.out.print("Enter customer's ID: ");
				String id = sc.next();

				CustomerDetails customer = new CustomerDetails();
				customer.setFirstName(firstName);
				customer.setLastName(lastName);
				customer.setId(id);

				// Get vehicle information
				System.out.print("Enter vehicle type (car/motorcycle/bicycle): ");
				String vehicleType1 = sc.next();

				VehicleDetails vehicle;
				if (vehicleType1.equalsIgnoreCase("car")) {
					vehicle = new Car();
				} else if (vehicleType1.equalsIgnoreCase("motorcycle")) {
					vehicle = new MotorCycle();
				} else if (vehicleType1.equalsIgnoreCase("bicycle")) {
					vehicle = new Bicycle();
				} else {
					System.out.println("Invalid vehicle type.");
					break;
				}

				// Get rental period
				System.out.print("Enter rental start time (yyyy-MM-dd'T'HH:mm:ss.SSSX)Ex:2023-07-06T02:06:58.147Z: ");
				String startTimeString = sc.next();
				LocalDateTime startTime = LocalDateTime.parse(startTimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX"));
				System.out.print("Enter rental end time (yyyy-MM-dd'T'HH:mm:ss.SSSX)Ex:2023-07-08T02:06:58.147Z: ");
				String endTimeString = sc.next();
				LocalDateTime endTime = LocalDateTime.parse(endTimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX"));

				Rental rental = rentalService.rentVehicle(customer, vehicle, startTime, endTime);
				if (rental != null) {
					System.out.println("Rental successful. Rental ID: " + rental.getId());
				} else {
					System.out.println("Vehicle is not available for rent.");
				}
				break;
			case 4:
				// Calculate rental cost
				// Get rental information
				System.out.print("Enter rental ID: ");
				int rentalId = sc.nextInt();

				Rental rentalToCalculate = null;
				for (Rental rentals : rentalService.getRentals()) {
					if (rentals.getId() == rentalId) {
						rentalToCalculate = rentals;
						break;
					}
				}

				if (rentalToCalculate != null) {
					BigDecimal rentalCost = rentalService.calculateRentalCost(rentalToCalculate);
					System.out.println("Rental cost: " + rentalCost);
				} else {
					System.out.println("Rental not found.");
				}
				break;
			case 5:
				// Return a vehicle
				// Get rental information
				System.out.print("Enter rental ID: ");
				int rentalId1 = sc.nextInt();

				Rental rentalToReturn = null;
				for (Rental rental1 : rentalService.getRentals()) {
					if (rental1.getId() == rentalId1) {
						rentalToReturn = rental1;
						break;
					}
				}

				if (rentalToReturn != null) {
					boolean success = rentalService.returnVehicle(rentalToReturn);
					if (success) {
						System.out.println("Vehicle returned successfully.");
					} else {
						System.out.println("Failed to return vehicle.");
					}
				} else {
					System.out.println("Rental not found.");
				}
				break;
			case 6:
				// Quit
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		} while (choice != 6);
		sc.close();
	}
}
