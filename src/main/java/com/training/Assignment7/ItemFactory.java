package com.training.Assignment7;

public class ItemFactory 
{
	public static Item createItem(String name, String description, double startingBid)
	{
		return new Item(name, description, startingBid);
	}
}
