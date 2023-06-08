package com.training.Assignment3.sample;

public  class VehicleDetails implements VehicleOperations
{
	private String licensePlate;
	
	private String make;
	private String model;
	private int year;
	private long rentalPricePerDay;
	private boolean isAvailable;
	
	
	public VehicleDetails()
	{
		
	}
	
	public VehicleDetails(String licensePlate, String make, String model, int year, long rentalPricePerDay,
			boolean isAvailable)
	{
		super();
		this.licensePlate = licensePlate;
		this.make = make;
		this.model = model;
		this.year = year;
		//this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;
	}

	public String getLicensePlate() 
	{
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) 
	{
		this.licensePlate = licensePlate;
	}

	public String getMake() 
	{
		return make;
	}
	public void setMake(String make) 
	{
		this.make = make;
	}
	public String getModel() 
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public boolean isAvailable() 
	{
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}
	
}
