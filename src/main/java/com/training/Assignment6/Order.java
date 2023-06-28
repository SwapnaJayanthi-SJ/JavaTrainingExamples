package com.training.Assignment6;

import java.io.Serializable;
import java.util.Map;

public class Order implements Serializable
{
	private static int nextConfirmationNumber = 1;
	private int confirmationNumber;
	private Map < Product, Integer > items;
	private double totalPrice;
	public Order(Map <Product,Integer> items, double totalPrice) 
	{
		this.confirmationNumber = nextConfirmationNumber++;
		this.items = items;
		this.totalPrice = totalPrice;
	}
	public int getConfirmationNumber() 
	{
		return confirmationNumber;
	}

	public Map <Product,Integer > getItems() 
	{
		return items;
	}

	public double getTotalPrice()
	{
		return totalPrice;
	}


}
