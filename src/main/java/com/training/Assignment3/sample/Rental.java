package com.training.Assignment3.sample;

import java.time.LocalDateTime;


 /**represent a vehicle rental transaction**/

public class Rental 
{
	
	private VehicleDetails rentedVehicle;
    private CustomerDetails customer;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
	

	public Rental(VehicleDetails rentedVehicle, CustomerDetails customer, LocalDateTime startTime,
			LocalDateTime endTime) {
		super();
		this.rentedVehicle = rentedVehicle;
		this.customer = customer;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	

}
