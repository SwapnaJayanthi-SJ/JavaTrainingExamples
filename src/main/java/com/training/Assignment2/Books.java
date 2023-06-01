package com.training.Assignment2;

import java.util.Scanner;

public class Books
{
	public static int MAX_BOOKS=10;
	Book[] Allbooks = new Book[MAX_BOOKS]; 
	int bookcount=0;
	public int compareBookObjects(Book b1, Book b2)
	{
		if (b1.bookName.equalsIgnoreCase(b2.bookName)) 
		{
			System.out.println("This Book name is already exists");
			return 0;
		}
		return 1;
	}

	public void addBook(Book b)
	{

		for (int i = 0; i < bookcount; i++) 
		{
			if (this.compareBookObjects(b, this.Allbooks[i])== 0)
				return;
		}
		Allbooks[bookcount++] = b;
	}
	public boolean count()
	{
		if(bookcount==MAX_BOOKS) {
			return false;
		}
		return true;
	}
	
}
