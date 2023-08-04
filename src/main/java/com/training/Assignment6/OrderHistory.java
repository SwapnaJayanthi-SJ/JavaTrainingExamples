package com.training.Assignment6;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrderHistory implements Serializable
{
	public static ProductCatalog productCatalog = new ProductCatalog();
	public static ShoppingCart shoppingCart =  new ShoppingCart();
	public static String fileName;

	static Scanner sc = new Scanner(System.in);
	private static List < Order > orders;
	public OrderHistory()
	{
		orders = new ArrayList<>();
	}
	
	/**
	 * Add orders to the list
	 * 
	 * @param order
	 */

	public static void addOrder(Order order) 
	{
		orders.add(order);
		saveOrderHistory();
	}
	
	/**
	 * Returns the available Orders
	 * @return
	 */
	
	public static List < Order > getAllOrders() {
		return orders;
	}
	public static void browseProducts() 
	{
		Collection < Product > products = productCatalog.getAllProducts();
		if (products.isEmpty()) 
		{
			System.out.println("No products available.");
		} else {
			for (Product product: products) {
				System.out.println(product.getName());
			}
		}
	}

	public static void addProductToCart()
	{
		System.out.print("Enter the name of the product: ");
		String productName = sc.nextLine().trim();
		Product product = productCatalog.getProduct(productName);
		if (product == null) 
		{
			System.out.println("Product not found.");
			return;
		}
		System.out.print("Enter the quantity: ");
		int quantity = getChoice(1, Integer.MAX_VALUE);
		shoppingCart.addItem(product, quantity);
		System.out.println("Product added to the shopping cart.");
	}

	static int getChoice(int min, int max) 
	{
		int choice = 0;
		boolean valid = false;
		while (!valid) 
		{
			try {
				choice = Integer.parseInt(sc.nextLine());
				if (choice >= min && choice <= max) 
				{
					valid = true;
				} else {
					System.out.println("Invalid choice. Please try again.");
				}
			} catch (NumberFormatException e) 
			{
				System.out.println("Invalid choice. Please try again.");
			}
		}
		return choice;
	}
	public static void viewShoppingCart()
	{
		shoppingCart.displayItems();
	}
	public static void placeOrder() 
	{
		if (shoppingCart.getTotalPrice() == 0) 
		{
			System.out.println("Shopping cart is empty. Please add some items before placing an order...");
			return;
		}
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		Order order = new Order(shoppingCart.getItems(),shoppingCart.getTotalPrice());
		addOrder(order);
		System.out.println("Order placed successfully. Confirmation Number: " + order.getConfirmationNumber());

	}
	public static void viewOrderHistory() 
	{
		double TotalPrice = 0;
		loadOrderHistory();
		List < Order > orders = OrderHistory.getAllOrders();
		if (orders.isEmpty()) 
		{
			System.out.println("No order history available.");
		} else 
		{
			for (Order order: orders) 
			{
				for(Map.Entry<Product, Integer> item:order.getItems().entrySet())
				{
					TotalPrice+= order.getTotalPrice();
					System.out.println("ConformationNumber: "+order.getConfirmationNumber()+"\nName: "+item.getKey().getName()+"\nDescription: "+item.getKey().getDescription()
							+"\nQuantity: "+item.getValue()+"\nPrice: "+order.getTotalPrice()+"\n");
				}

			}
			System.out.println("TotalPrice: "+TotalPrice);
		}
	}

	public void loadProductCatalog() 
	{
		System.out.print("Do you want to load an existing product file? (Y/N): ");
		String choice = sc.nextLine();
		if (choice.equals("Y"))
		{
			System.out.print("Enter the file name to load from: ");
			String fileName = sc.nextLine();
			productCatalog.loadProducts(fileName);
		}
	}

	public static void saveProductCatalog() 
	{
		System.out.print("Do you want to save the product catalog? (Y/N): ");
		String choice = sc.nextLine().trim().toUpperCase();
		if (choice.equals("Y")) 
		{
			System.out.print("Enter the file name to save to: ");
			String fileName = sc.nextLine().trim();
			productCatalog.saveProducts(fileName);
		}
	}

	
	/**
	 * Deseralize the order History
	 */
	
	public static void loadOrderHistory() 
	{

		fileName = "C:\\Workspace\\Jun2023_Java\\JavaTrainingExamples\\src\\main\\java\\com\\training\\Assignment6\\OrderHistory.java";
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			orders = (List<Order>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) 
		{
			System.out.println("Error loading order history: " + e.getMessage());
		}

	} 
	
	/**
	 * Seralize the order History
	 */
	
	
	public static void saveOrderHistory() 
	{
		fileName = "C:\\Workspace\\Jun2023_Java\\JavaTrainingExamples\\src\\main\\java\\com\\training\\Assignment6\\OrderHistory.java";
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			oos.writeObject(orders);
		} 
		catch (IOException e) {
			System.out.println("Error saving order history: " + e.getMessage());
		}
	}
}
