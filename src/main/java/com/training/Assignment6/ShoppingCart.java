package com.training.Assignment6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart 
{
	Scanner sc = new Scanner(System.in);
	private Map <Product,Integer> items = new HashMap<>();
	String product;
	public ShoppingCart() 
	{

	}

	public void addItem(Product product, int quantity) 
	{
		items.put(product, items.getOrDefault(product, 0) + quantity);
	}

	public void removeItem(Product product) 
	{
		items.remove(product);
	}

	public Map <Product,Integer> getItems() 
	{
		return items;
	}
	public double getTotalPrice() 
	{
		double totalPrice = 0;
		for (Map.Entry <Product,Integer> entry: items.entrySet())
		{
			Product product = entry.getKey();
			int quantity = entry.getValue();
			totalPrice += product.getPrice() * quantity;
		}
		return totalPrice;
	}

	public void clear() 
	{
		items.clear();
	}

	public void displayItems() 
	{
		if (items.isEmpty()) {
			System.out.println("Shopping cart is empty.");
			return;
		}
		System.out.println("Items in the shopping cart:");
		for (Map.Entry < Product, Integer > entry: items.entrySet()) 
		{
			Product product = entry.getKey();
			int quantity = entry.getValue();
			System.out.println(product.getName() + " - Quantity: " + quantity);
		}
		System.out.println("Total Price: $" +getTotalPrice());
		System.out.println("Do you want to remove the Product (Y/N)");
		String remove = sc.next();
		if(remove.equalsIgnoreCase("y"))
		{
			System.out.print("Enter the product you want to Remove: ");
			String removeProduct = sc.next();
			removeProduct+=sc.nextLine();
			for (Map.Entry < Product, Integer > item: items.entrySet())
			{
				if(item.getKey().getName().equalsIgnoreCase(removeProduct))
				{
					removeItem(item.getKey());
					System.out.println("Product removed Sucessfully");
					break;

				}
			}
		}
	}
}
