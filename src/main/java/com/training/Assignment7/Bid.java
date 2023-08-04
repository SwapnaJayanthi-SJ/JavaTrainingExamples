package com.training.Assignment7;

public class Bid 
{
	private String itemName;
	private String description;
	private double bidAmount;
	private boolean winbid;
	
	
	/** creating constructor for Bid class **/
	
	public Bid(String itemName, String description, double bidAmount)
	{
		this.itemName = itemName;
		this.description = description;
		this.bidAmount = bidAmount;
	}


	/** Return the item name **/
	
	public String getItemName() 
	{
		return itemName;
	}

	/** Return the Item Description **/
	
	public String getDescription() 
	{
		return description;
	}


	public void setDescription(String description) 
	{
		this.description = description;
	}


	/** Return the bid amount **/
	
	public double getBidAmount() 
	{
		return bidAmount;
	}

    /** Set the Winning bidder **/
	
	public boolean isWinbid() 
	{
		return winbid;
	}


	/** Return the Winning bidder **/
	
	public void setWinbid(boolean winbid) 
	{
		this.winbid = winbid;
	}
	
	

}
	