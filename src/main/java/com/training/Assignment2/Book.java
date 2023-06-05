package com.training.Assignment2;

import java.util.Scanner;

public class Book
{
	public String bookName;
	private static final int MAX_PATRONS=2;
	private static final int MAX_BOOKS=2;
	private static  String[] patrons=new String[MAX_PATRONS];
	public String authorName;
	public int patronCount=0;
	public int authorCount=0;
	public int[] author;
	public String auth;
	int availablebooksCount=0;
	private static  String[] barrowbooks=new String[MAX_BOOKS];
	private static  String[] availablebooks=new String[MAX_BOOKS];
	private static  String[] books=new String[MAX_BOOKS];
	int borrowCount;
	int bookCount;
	String patron;;
	String title;
	Book book;


	Scanner sc = new Scanner(System.in);

	
	  public Book() 
	  { 
	  System.out.print("Enter the Book Title:"); 
	  this.bookName = sc.nextLine();
	  System.out.print("Enter the Book Author:"); 
	  this.authorName =
	  sc.nextLine(); System.out.println("Book added Successfully");
	  
	  
	  }
	

	public void addPatron()
	{
		System.out.print("Enter the PatronName:");
		auth = sc.next();	
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
				}
				else {
					System.out.println("Patron already exist..enter another patron name");
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

	
	  public void borrowBooks() 
	  { 
	  System.out.print("Enter patron name:");
	  this.bookName = sc.next(); 
	  System.out.print("Enter Book title:");
	  this.authorName = sc.next(); 
	  book = new Book();
	//  book.borrowBook(patron, title);
	  
	  }
	 
	public void borrowBook()
	{
		String title = null;
		String user = null;
		System.out.print("Enter patron name:");
		this.bookName = sc.next();
		System.out.print("Enter Book title:");
		this.authorName = sc.next();
		if(availablebooksCount==0)
		{
			System.out.println("Books are not available..please add books into library");
		}
		else
		{
			if(patronexist(user))
			{
				if(availableBooks(title))
				{
					barrowbooks[borrowCount++]=title;
					System.out.println("Successfully borrowed book");
					for(int i=0;i<availablebooksCount;i++)
					{
						if(availablebooks[i].equalsIgnoreCase(title))
						{
							for(int j=i;j<availablebooks.length-1;j++)
							{
								availablebooks[j]=availablebooks[j+1];
							}
							availablebooksCount--;
							break;
						}
					}
				}
				else
				{
					System.out.println("Selected book is not available..please check another book");
				}

			}
			else {
				System.out.println("patron doesnot exist..");
			}
		}
	}
	private boolean availableBooks(String title)
	{
		for (int i=0;i<availablebooksCount;i++) 
		{
			if(availablebooks[i].equalsIgnoreCase(title)) {
				return true;
			}
		}
		return false;
	}
	public void returnBook()
	{
		String title=null;
		if(bookexist(title))
		{
			if(borrowBooks(title))
			{
				availablebooks[availablebooksCount++]=title;
				System.out.println("Successfully returned book..");
			}
			for(int i=0;i<borrowCount;i++)
			{
				if(availablebooks[i].equalsIgnoreCase(title))
				{
					for(int j=i;j<barrowbooks.length-1;j++)
					{
						barrowbooks[j]=barrowbooks[j+1];
					}
					borrowCount--;
					break;
				}
			}
			{
				System.out.println("Selected book is not available..please choose another book");
			}
		}

		else 
		{
			System.out.println("You selected invalid book");
		}
	}
	private boolean borrowBooks(String title) 
	{
		for (int i=0;i<borrowCount;i++) 
		{
			if(barrowbooks[i].equalsIgnoreCase(title)) 
			{
				return true;
			}

		}
		return false;
	}
	private boolean bookexist(String title) 
	{
		for (int i=0;i<bookCount;i++) 
		{
			if(books[i].equalsIgnoreCase(title)) {
				return true;
			}
		}
		return false;
	}

}