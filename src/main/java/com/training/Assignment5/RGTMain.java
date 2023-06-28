package com.training.Assignment5;

import java.util.Scanner;

public class RGTMain 
{
	DataStore dataStore = new DataStore();
	private static Scanner sc;
	public static void main(String[] args) 
	{
		
		sc = new Scanner(System.in);

		RGTMessaging rgtMessaging = new RGTMessaging();
		
		boolean exit = false;
		while (!exit) 
		{
			System.out.println("Welcome to the Tweeter");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) 
			{
			case 1:
				rgtMessaging.registerUser();
				break;
				
				
			case 2:
				rgtMessaging.loginUser();
				
			case 3:
				System.out.println("Thank you for using RGTMessaging App....");
				break;
			default:
				System.out.println("Invalid input...");
				break;
			}

		}
	}
}
