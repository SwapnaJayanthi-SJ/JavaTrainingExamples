package com.training.Assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User 
{
	public String username;
	public String password;
	private List<Bid> biddingHistory;

	Scanner sc = new Scanner(System.in);

	/** creating constructor for user class **/

	public User(String username, String password) 
	{
		this.username = username;
		this.password = password;
		this.biddingHistory = new ArrayList<>();
	}

	/** Return the Username **/

	public String getUsername() 
	{
		return username;
	}

	/** Return the Password **/

	public String getPassword() 
	{
		return password;
	}

	/** Return the bidding history as list **/

	public List<Bid> getBiddingHistory() 
	{
		return biddingHistory;
	}

	/** Add the bid details to the list **/

	public void addBid(Bid bid)
	{
		biddingHistory.add(bid);
	}

}
