package com.training.Assignment2_modified;

import java.util.Scanner;

public class LibrarySystem 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LibrarySystem librarySystem = null;
		int choice = 0;
		Book book = new Book();
		do
		{
			if(librarySystem==null)
			{
				System.out.println("Library Management System");
				System.out.println("1.Add Book");
				System.out.println("2.Add Patron");
				System.out.println("3.Borrow Book");
				System.out.println("4.Return Book");
				System.out.println("5.Exit");
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					book.addBooks();
					break;
				case 2:
					book.addPatron();
					break;
				case 3:
					book.borrowBook();
					break;
				case 4:
                    book.returnBook();
                    break;
				default:
					System.out.println("Invalid option");
				}
			}
		}
	while(choice!=3);
	System.out.println("Thank you for using our service, Please visit again...");
	sc.close();
}
}