package com.training.Assignment2;

import java.util.Scanner;
public class LibrarySystem {



	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LibrarySystem librarySystem = null;
		Books books = new Books();
		Book book = null;

		int choice = 0;

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
					if(books.bookcount()) {
						book = new Book();
						books.addBook(book);
					}else {
						System.out.println("You are unable to add more books..");
						System.out.println("please choose another option, maxcount already reached");
					}

					break;
				case 2:
					if(book.patroncount())
					{
						book.addPatron();
					}
					else {
						System.out.println("You are unable to add more patrons..");
						System.out.println("please choose another option, maxcount already reached");
					}
					
					break;
				case 3:
					book.borrowBook();
					break;
				case 4:
				   book.returnBook();
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
