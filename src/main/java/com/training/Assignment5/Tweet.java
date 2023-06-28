package com.training.Assignment5;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Tweet 
{

	public String id;
	public String content;
	public String author;
	public LocalDateTime timeStamp;


	public Set<User> likes = new HashSet<User>();
	HashMap<String, User> retweets = new HashMap<String, User>();
	HashMap<String, User> replies = new HashMap<String, User>();

	public Tweet(String id, String content, String author, LocalDateTime timeStamp) {
		super();
		this.id = id;
		this.content = content;
		this.author = author;
		this.timeStamp = timeStamp;

	}

	public void likes(User user)
	{
		likes.add(user);
	}
	public Set<User> getLikes() {
		return likes;
	}
	public  int getLikesCount() {
		return likes.size();
	}

	public void retweet(String retweet, User user)
	{
		retweets.put(retweet, user);
	}
	public HashMap<String, User> getRetweets() 
	{
		return retweets;
	}
	public int getRetweetscount() {
		return retweets.size();
	}
	public void reply(String reply, User user) 
	{
		replies.put(reply, user);

	} 
	public HashMap<String, User> getReplies() {
		return replies;
	}
	public int getRepliescount() {
		return replies.size();
	}

	public String getContent() {
		return content;
	}

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}



}
