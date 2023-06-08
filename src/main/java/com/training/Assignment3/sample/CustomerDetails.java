package com.training.Assignment3.sample;

public class CustomerDetails
{
	public int customerID;
	public String firstName;
	public String lastName;
	public String emailAddress;
	public long phoneNumber;
	
	public void getFullName()
	{
		System.out.println("Full Name is:"+firstName+" "+lastName);
	}
}
