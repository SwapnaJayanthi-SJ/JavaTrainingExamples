package com.training.Assignment1;

import java.util.Scanner;

public class ATMCheck 
{
	public static void main(String[] args) 
	{
		AccountProcess ac_process = new AccountProcess();
		Scanner sc = new Scanner(System.in);
		Account currentAccount=null;
		int choice = 0;

		do
		{
			if(currentAccount==null)
			{
				System.out.println("Welcome to the ATM");
				System.out.println("1.create account");
				System.out.println("2. login");
				System.out.println("3.exit");
				System.out.println("choose an option: ");
				choice = sc.nextInt();

				switch(choice)
				{
				case 1:

					ac_process.createAccount();
					break;

				case 2:
					ac_process.login();
					break;

				case 3:
					System.out.println("Goodbye!");
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
