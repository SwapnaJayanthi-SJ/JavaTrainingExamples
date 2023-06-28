package com.training.Assignment5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class User {

	public String username;
	public String password;
	public String name;
	public String bio;
	Scanner sc = new Scanner(System.in);
	String content;
	public Set<String> followings;
	public List<String> getTweets() {
		return tweets;
	}

	public void setTweets(List<String> tweets) {
		this.tweets = tweets;
	}

	public Set<String> followers;
	public List<String> tweets;

	/*
	 * public String name; public String bio; public int followings; public int
	 * followers; public int tweets;
	 */

	public User(String username, String password, String name, String bio) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.bio = bio;
		this.followings = new HashSet<String>();
		this.followers = new HashSet<String>();
		this.tweets = new ArrayList<String>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Set<String> getFollowings() {
		return followings;
	}

	public void setFollowings(Set<String> followings) {
		this.followings = followings;
	}

	public Set<String> getFollowers() {
		return followers;
	}

	public void setFollowers(Set<String> followers) {
		this.followers = followers;
	}

	public void follow(User user) {

		followings.add(user.getUsername());
		user.followers.add(username);
		System.out.println("you are successfully followed "+ user.getUsername());
	}

	public void unfollow(User user) {
		followings.add(user.getUsername());
		user.followers.remove(username);
		System.out.println("you are successfully unfollowed "+user.getUsername());
	}


	public void postTweet(String tweetId) {
		tweets.add(tweetId);
	}

	
	public void deleteTweet(String tweetId) 
	{

		tweets.remove(tweetId);
		System.out.println("tweet removed successfully");
	}


}
