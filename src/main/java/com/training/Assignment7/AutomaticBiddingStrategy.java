package com.training.Assignment7;

public class AutomaticBiddingStrategy implements BiddingStrategy
{
	@Override
	public double bid(Item item, User user,  double amount)
	{
		double currentBid = item.getCurrentHighestBid();
		double newBid = currentBid + 1.0;
		item.placeBid(user, newBid);
		return newBid;

	}
}
