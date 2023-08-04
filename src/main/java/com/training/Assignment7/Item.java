package com.training.Assignment7;

public class Item 
{
	private String name;
	private String description;
	private double currentHighestBid;
	private User highestBidder;

	
	/** creating constructor for item class **/

	public Item(String name, String description, double startingBid) 
	{
		this.name = name;
		this.description = description;
		this.currentHighestBid = startingBid;
	}
	

	/** Return the item name **/
	
	public String getName() 
	{
		return name;
	}

	/** Return the Item Description **/

	public String getDescription() 
	{
		return description;
	}

	/** Return the Current bidding price **/
	
	public double getCurrentHighestBid()
	{
		return currentHighestBid;
	}

	
	/**  Return the Highest bidding User **/
	
	public User getHighestBidder() 
	{
		return highestBidder;
	}

	public void placeBid(User user, double bidAmount) 
	{
		if (bidAmount > currentHighestBid) 
		{
			currentHighestBid = bidAmount;
			highestBidder = user;
		}
	}

}
