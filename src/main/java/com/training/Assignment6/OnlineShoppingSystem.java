package com.training.Assignment6;

import java.util.Scanner;

public class OnlineShoppingSystem
{
	private static Scanner sc;
	private static OrderHistory orderHistory = new OrderHistory();
	static ProductCatalog productCatalog = new ProductCatalog();
	static int choice;

	public static void main(String[] args) 
	{

		sc = new Scanner(System.in);

		boolean exit = false;
		while (!exit) 
		{
			System.out.println("======= Welcome to the Online Shopping System ========");
			System.out.println("1. Create products");
			System.out.println("2. Browse products");
			System.out.println("3. Add product to shopping cart");
			System.out.println("4. View shopping cart");
			System.out.println("5. Place order");
			System.out.println("6. View order history");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				System.out.println("Enter file name: ");
				String filename=sc.next();
				createProducts(filename);
				break;

			case 2:
				orderHistory.loadProductCatalog();
				OrderHistory.browseProducts();
				break;
			case 3:
				OrderHistory.addProductToCart();
				break;
			case 4:
				OrderHistory.viewShoppingCart();
				break;
			case 5:
				OrderHistory.placeOrder();
				break;
			case 6:
				OrderHistory.viewOrderHistory();
				break;
			case 7:
				System.out.println("Thank you for using our Application, Visit again...");
				break;
			default:
				System.out.println("Invalid input...");
			}
		}
		while(!(choice==7));


	}

	/** creating the new products **/
	
	private static void createProducts(String filename) 
	{


		System.out.println("Enter product size");

		int size = sc.nextInt();

		for(int i=0;i<size;i++) {

			System.out.println("Enter product name");

			String productName = sc.next();

			productName+=sc.nextLine();

			System.out.println("Enter description name");

			String description = sc.nextLine();

			System.out.println("Enter price");

			Double price = sc.nextDouble();

			System.out.println("Enter quantity");

			Integer quantity = sc.nextInt();

			Product product =new Product(productName,description,price,quantity);

			productCatalog.addProduct(product);

		}

		productCatalog.saveProducts(filename);
	}
}
