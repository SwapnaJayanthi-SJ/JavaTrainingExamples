package com.training.Assignment7;

public class IncrementalBiddingStrategy implements BiddingStrategy
{

	@Override
	public double bid(Item item, User user, double newBid) 
	{
		NotificationService notificationService = new NotificationService();
		double currentBid = item.getCurrentHighestBid();
		if (newBid > currentBid) {
			item.placeBid(user, newBid);
			return newBid;
		} else {
			System.out.println("Amount should not be less than the minimum bidding amount...");
			notificationService.notifyUser(user, item);
		}
		return 0;
		
	}

}
