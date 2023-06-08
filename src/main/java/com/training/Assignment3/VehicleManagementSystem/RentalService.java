package com.training.Assignment3.VehicleManagementSystem;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RentalService implements RentalCostCalculator 
{
	private List<VehicleDetails> vehicles;
	private List<Rental> rentals;

	public RentalService() {
		vehicles = new ArrayList<VehicleDetails>();
		rentals = new ArrayList<Rental>();
	}

	public void addVehicle(VehicleDetails vehicle) {
		vehicles.add(vehicle);
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	// Display available vehicles
	public List<VehicleDetails> getAvailableVehicles() 
	{
		List<VehicleDetails> availableVehicles = new ArrayList<VehicleDetails>();
		for (VehicleDetails vehicle : vehicles) 
		{
			if (vehicle.isAvailable()) 
			{
				availableVehicles.add(vehicle);
			}
		}
		return availableVehicles;
	}

	// Rent a vehicle
	public Rental rentVehicle(CustomerDetails customer, VehicleDetails vehicle, LocalDateTime startTime, LocalDateTime endTime) {
		Rental rental = new Rental();
		rental.setCustomer(customer);
		rental.setRentedVehicle(vehicle);
		rental.setStartTime(startTime);
		rental.setEndTime(endTime);
		rentals.add(rental);
		vehicle.setAvailable(false);
		return rental;
	}

	// Calculate rental cost
	public BigDecimal calculateRentalCost(Rental rental) {
		LocalDateTime startTime = rental.getStartTime();
		LocalDateTime endTime = rental.getEndTime();
		Duration duration = Duration.between(startTime, endTime);

		// Perform the calculation based on the duration
		long hours = duration.toHours();
		BigDecimal hourlyRate = BigDecimal.valueOf(10); // Assuming an hourly rate of Rs10

		BigDecimal rentalCost = hourlyRate.multiply(BigDecimal.valueOf(hours));

		// Return the calculated rental cost
		return rentalCost;
	}

	// Return a rented vehicle
	public boolean returnVehicle(Rental rental) {
		VehicleDetails rentedVehicle = rental.getRentedVehicle();
		if (rentedVehicle != null) {
			rentedVehicle.setAvailable(true);
			rentals.remove(rental);
			return true;
		}
		return false;
	}
}
