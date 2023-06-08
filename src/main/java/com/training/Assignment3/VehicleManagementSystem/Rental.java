package com.training.Assignment3.VehicleManagementSystem;

import java.time.LocalDateTime;

public class Rental 
{

	private int id;
	private VehicleDetails rentedVehicle;
	private CustomerDetails customer;
	private LocalDateTime startTime;
	private LocalDateTime endTime;

	public VehicleDetails getRentedVehicle() {
		return rentedVehicle;
	}

	public void setRentedVehicle(VehicleDetails rentedVehicle) {
		this.rentedVehicle = rentedVehicle;
	}

	public CustomerDetails getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Rental [id=" + id + ", rentedVehicle=" + rentedVehicle + ", customer=" + customer + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}

}
