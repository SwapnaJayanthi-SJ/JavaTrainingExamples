package com.training.Assignment2;

import java.util.Scanner;

public class Book
{
	public String bookName;
	private static final int MAX_PATRONS=5;
	private static  String[] patrons=new String[MAX_PATRONS];
	public String authorName;
	public int patronCount=0;
	public int authorCount=0;
	public int[] author;
	public String auth;


	Scanner sc = new Scanner(System.in);

	public Book()
	{
		System.out.println("Enter the Book Title:");
		this.bookName = sc.nextLine();

		System.out.println("Enter the Book Author:");
		this.authorName = sc.nextLine();
	}
	public void addPatron()
	{
		System.out.println("Enter the PatronName:");
		auth = sc.nextLine();	
		if(patronCount<=MAX_PATRONS) 
		{
			if(patronCount==0) 
			{
				patrons[patronCount++]=auth;
				System.out.println("Patron added Successfully");
			}
			else {
				if(!patronexist(auth)) {
					patrons[patronCount++]=auth;
					System.out.println("Patron added Successfully");
					System.out.println(" ");
				}
				else {
					System.out.println("Patron already exist");
				}
			}

		}
	}


	public boolean patroncount()
	{
		if(patronCount==MAX_PATRONS) {
			return false;
		}
		return true;
	}
	
	public boolean patronexist(String user) {

		for (int i=0;i<patronCount;i++) 
		{
			if(patrons[i].equalsIgnoreCase(user)) {
				return true;
			}
		}
		return false;
	}
}