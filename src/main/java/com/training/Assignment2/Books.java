package com.training.Assignment2;

public class Books
{
	public static int MAX_BOOKS=2;
	Book[] Allbooks = new Book[MAX_BOOKS]; 
	int bookCount=0;
	public int compareBookObjects(Book b1, Book b2)
	{
		if (b1.bookName.equalsIgnoreCase(b2.bookName)) 
		{
			System.out.println("This Book name is already exists..please add another book name");
			return 0;
		}
		return 1;
	}

	public void addBook(Book b)
	{

		for (int i = 0; i < bookCount; i++) 
		{
			if (this.compareBookObjects(b, this.Allbooks[i])== 0)
				return;
		}
		Allbooks[bookCount++] = b;
	}
	public boolean bookcount()
	{
		if(bookCount==MAX_BOOKS) {
			return false;
		}
		return true;
	}
	
}
