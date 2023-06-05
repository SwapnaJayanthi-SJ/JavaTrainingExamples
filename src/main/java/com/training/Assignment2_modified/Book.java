package com.training.Assignment2_modified;

import java.util.Scanner;

public class Book 
{

	LibrarySystem lb = new LibrarySystem();
	private static final int MAX_BOOKS = 2;
	private static final int MAX_PATRONS=10;
	private static  String[] books=new String[MAX_BOOKS];
	private static  String[] authors=new String[MAX_BOOKS];
	private static  String[] availablebooks=new String[MAX_BOOKS];
	private static  String[] barrowbooks=new String[MAX_BOOKS];
	private static  String[] patrons=new String[MAX_PATRONS];

	int availablebooksCount=0;
	int borrowCount=0;
	int bookCount = 0;
	int authorCount=0;
	int patronCount=0;
	public String auth;
	

	static Scanner sc = new Scanner(System.in);

	static String author;
	static String title;
	static String patronName;

	public void addBooks() 
	{
		Book book = new Book();
		if(book.bookCount())
		{
			System.out.print("Enter the Book title: ");
			title=sc.next();
			System.out.print("Enter Author name: ");
			author=sc.next();
		}
		else 
		{
			System.out.println("You are unable to add more books..");
			System.out.println("please choose another option, maxcount already reached");
		}

		if(bookCount<=MAX_BOOKS) {
			if(bookCount==0) {
				books[bookCount++]=title;
				availablebooks[availablebooksCount++]=title;
				authors[authorCount++]=author;
				System.out.println("Book added Successfully");
			}
			else 
			{
				if(!bookexist(title)) {
					books[bookCount++]=title;
					availablebooks[availablebooksCount++]=title;
					authors[authorCount++]=author;
					System.out.println("Book added Successfully");
				}
				else {
					System.out.println("This Book name is already exists..please add another book name");
				}
			}
		}
	}
	public boolean bookCount() 
	{
		if(bookCount==MAX_BOOKS) 
		{
			return false;
		}
		return true;

	}

	public boolean bookexist(String title) 
	{
		for (int i=0;i<bookCount;i++) 
		{
			if(books[i].equalsIgnoreCase(title)) 
			{
				return true;
			}

		}
		return false;
	}
	public boolean authorexist(String author) 
	{
		for (int i=0;i<authorCount;i++) 
		{
			if(authors[i].equalsIgnoreCase(author)) 
			{
				return true;
			}

		}
		return false;
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
					System.out.println("Patron already exist..please enter another patron name");
				}
			}

		}
	}
	public boolean patronexist(String user)
	{
		for (int i=0;i<patronCount;i++) 
		{
			if(patrons[i].equalsIgnoreCase(user)) {
				return true;
			}
		}
		return false;
	}

	public boolean patroncount()
	{
		if(patronCount==MAX_PATRONS) {
			return false;
		}
		return true;
	}


	public void borrowBook()
	{
		System.out.print("Enter the patron name :");
		patronName=sc.next();
		System.out.print("Enter the book title:");
		title=sc.next();
		if(availablebooksCount==0) {
			System.out.println("No Books are available, Please add books into library...");
		}else 
		{
			if(patronexist(patronName)) 
			{
				if(availableBooks(title)) {
					barrowbooks[borrowCount++]=title;
					System.out.println("Book borrowed Successfully");
					for (int i=0;i<availablebooksCount;i++) {
						if(availablebooks[i].equalsIgnoreCase(title)) {
							for (int j=i;j<availablebooks.length-1;j++) {
								availablebooks[j]=availablebooks[j+1];
							}
							availablebooksCount--;
							break;
						}
					}
				}
				else 
				{
					System.out.println("This book is not available ");
				}	
			}else
			{
				System.out.println("patron doesnot exist");
			}

		}
	}

	public boolean availableBooks(String title) 
	{
		for (int i=0;i<availablebooksCount;i++) 
		{
			if(availablebooks[i].equalsIgnoreCase(title)) 
			{
				return true;
			}
		}
		return false;
	}

	public boolean barrowBooks(String title) 
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
	
	public void returnBook() 
	{
		System.out.print("Enter the book title:");
		title=sc.next();	
		if(bookexist(title)) 
		{
			if(barrowBooks(title)) 
			{
				availablebooks[availablebooksCount++]=title;
				System.out.println("Book returned Successfully");
				for (int i=0;i<borrowCount;i++) 
				{
					for (int j=i;j<barrowbooks.length-1;j++) 
					{
						barrowbooks[j]=barrowbooks[j+1];
					}
					borrowCount--;
					break;
				}
			}else 
			{
				System.out.println("This book is not yet borrowed");
			}
		}else {
			System.out.println("This book Invalid book");
		}
	}
}