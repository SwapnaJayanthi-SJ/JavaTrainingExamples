package com.training.Assignment7;

public class NotificationService
{
	public void notifyUser(User user, Item item) 
	{
		UserObserver userObserver = new UserObserver(user);
		userObserver.update(item);
	}
}
