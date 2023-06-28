package com.training.Assignment5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RGTMessaging {

	private Map<String, User> userData;
	private List<Tweet> tweetData;
	private User currentUser;

	public RGTMessaging() {
		super();
		this.userData = new HashMap<String, User>();
		this.tweetData = new ArrayList<Tweet>();
		this.currentUser = null;
	}

	Scanner sc = new Scanner(System.in);
	DataStore dataStore = new DataStore();

	public void registerUser() {
		System.out.print("Enter the username: ");
		String username = sc.next();
		if (userData.containsKey(username)) {
			System.out.println("Given Username is already exists... Please enter a different username..");
			return;
		}

		System.out.print("Enter the password: ");
		String password = sc.next();
		System.out.print("Enter the name: ");
		String name = sc.next();
		System.out.print("Enter the bio: ");
		String bio = sc.next();
		User newUser = new User(username, password, name, bio);
		userData.put(username, newUser);
		System.out.println("User Added successfully");
	}

	public void loginUser() {

		System.out.print("Enter the username: ");
		String username = sc.next();
		System.out.print("Enter the password: ");
		String password = sc.next();

		User user = userData.get(username);
		if (user != null) {

			if (user.getPassword().equals(password)) {
				currentUser = user;
				System.out.println("Successfully login!");
				System.out.println("Welcome: " +user.getUsername());

				while (true) {

					System.out.println("1. Post a tweet");
					System.out.println("2. View your timeline");
					System.out.println("3. Search for users");
					System.out.println("4. Search for tweets");
					System.out.println("5. View your profile");
					System.out.println("6. Logout");
					System.out.print("Enter your choice: ");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						postTweet();
						break;

					case 2:
					//	user.viewTimeline();
						break;

					case 3:
						searchUser(sc);
						break;

					case 4:
						searchTweet(sc);
						break;

					case 5: 
						viewProfile(); 
						break;

					case 6:

						System.out.println("Logged out successfully.");
						break;
					default:
						System.out.println("Invalid choice. Try again.");
						break;
					}
				}
			}

			else {
				System.out.println("please enter valid details..");
			}
		}

	}

	public void logout() 
	{

	}

	public List<Tweet> getTimeline() {

		return tweetData;

	}

	public void getProfile() {

	}

	public void searchUser(Scanner scanner) {
		System.out.print("Enter the username to search for:");
		String username = scanner.next();
		if (userData.containsKey(username)) {
			User user = userData.get(username);
			System.out.println("User found:");
			System.out.println("Username:" + user.getUsername());
			System.out.println("Username:" + user.getName());
			System.out.println("Bio: " + user.getBio());
		} else {
			System.out.println("User not found.");
		}
	}

	public void searchTweet(Scanner scanner) 
	{
		System.out.print("Enter the id:");
		String id = scanner.next();
		for (Tweet tweet : tweetData) 
		{
			if (tweet.getId().equals(id)) 
			{
				System.out.println("given tweet found:");
				System.out.println("ID: " +tweet.getId());
				System.out.println("content: " +tweet.getContent());
				System.out.println("Author: " +tweet.getAuthor());
				System.out.println("Timestamp: " +tweet.getTimeStamp());
				System.out.println("Likes: " +tweet.getLikesCount());
				//return;

			}

			int choice;
			do
			{
				System.out.println("1.Like \n2.Retweet \n3.Reply \n4.Home");
				System.out.println("Enter your choice: ");
				choice=sc.nextInt();
				switch (choice) 
				{
				case 1:if(tweet.getLikes().isEmpty())
				{
					System.out.println("No likes");
				}
				else
				{
					for(User likes:tweet.getLikes()) 
					{

						System.out.println(likes.getUsername());

					}
				}
					System.out.println("1:To Like \n2:Exit ");

					int likechoice=sc.nextInt();

					switch (likechoice)
					{

					case 1:like(tweet);

					break;

					}
		
				break;
				case 2: if(tweet.getRetweets().isEmpty())
				{
					System.out.println("No Retweets");
				}
				else
				{
					for(Map.Entry<String, User> retweet:tweet.retweets.entrySet()) {
						System.out.println(retweet.getKey()+"    "+retweet.getValue().getUsername());
					}

				}
				System.out.println("1:To Retweet \n2:Exit ");
				int retweetchoice = sc.nextInt();
				switch(retweetchoice)
				{
				case 1:retweet(tweet);
				break;
				}
				break;
				case 3:
					if(tweet.getReplies().isEmpty()) {
						System.out.println("No Retweets");
					}else {
						for(Map.Entry<String, User> replies:tweet.replies.entrySet()) {
							System.out.println(replies.getKey()+"    "+replies.getValue().getUsername());
						}
					}
					System.out.println("1:To Reply \n2:Exit ");
					int replychoice=sc.nextInt();
					switch (replychoice) {
					case 1:reply(tweet);
					break;
					}
					break;
				case 4: System.out.println("Home");
				break;
				default:
					System.out.println("Invalid input...");
				}
			}while(choice!=4);

		}

	}

	public void postTweet()
	{
		System.out.print("Enter the id: ");
		String id = sc.next();
		System.out.print("Enter the tweet: ");
		String content = sc.next();
		Tweet tweet = new Tweet(id,content,currentUser.getUsername(),LocalDateTime.now());
		tweetData.add(tweet);
		currentUser.postTweet(id);
		System.out.println("tweet added successfully");
	}

	public void viewProfile()
	{
		System.out.println("User Profile:");
		System.out.println("UserName:" +currentUser.getUsername());
		System.out.println("User Bio:" +currentUser.getBio());
		System.out.println("User Followers:" +currentUser.getFollowers().size());
		System.out.println("User Followings:" +currentUser.getFollowings().size());
		System.out.println("User Tweets:" +currentUser.getTweets().size());
		boolean Exit = false;
		while(!Exit)
		{
			System.out.println("1. Follow user");
			System.out.println("2. UnFollow user");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the username: ");
				String username = sc.next();
				User user = userData.get(username);
				if(user !=null)
					currentUser.follow(user);
				break;
			case 2:
				System.out.println("Enter the username: ");
				String username1 = sc.next();
				User user1 = userData.get(username1);
				if(user1 !=null)
				{
					currentUser.unfollow(user1);
				}
				break;
			case 3:

				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid option");

			}

		}
	}

	public void like(Tweet tweet)
	{
		tweet.likes(currentUser);
	}

	public void retweet(Tweet tweet)
	{
		System.out.println("Add your Retweet: ");
		String retweet=sc.nextLine();
		retweet+=sc.nextLine();
		tweet.retweet(retweet,userData.get(currentUser.getUsername()));
	}
	public void reply(Tweet tweet) {
		System.out.println("Add your Reply: ");
		String reply=sc.nextLine();
		reply+=sc.nextLine();
		tweet.reply(reply,userData.get(currentUser.getUsername()));
	}

}
