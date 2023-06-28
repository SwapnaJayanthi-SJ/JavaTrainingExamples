package com.training.Assignment5;


import java.util.HashMap;
import java.util.Map;

public class DataStore 
{

	public Map<String, User> userData;
	

	public DataStore() {
		super();
		this.userData = new HashMap<String, User>();
	}
	public void saveData()
	{

	}
	public void localData()
	{

	}
	public void generateTweetId()
	{

	}

	public boolean isUserExists(String username) 
	{
		if (!userData.isEmpty()) 
		{
			return userData.containsKey(username);
		}
		return false;
	}
	
	public User getUser(String username) 
	{
		return userData.get(username);

	}
	/*
	 * public List<User> searchUser(String username) { List<User> searchData = new
	 * ArrayList<>(); for (User user : userData.values()) { if
	 * (user.getUsername().contains(username)) { searchData.add(user); } } return
	 * searchData; }
	 */
}
