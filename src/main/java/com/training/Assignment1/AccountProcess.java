package com.training.Assignment1;

import java.util.Scanner;
public class AccountProcess 
{
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();
	int choice;

	public void createAccount()
	{
		System.out.println("Enter the Account Number");
		int accNum = sc.nextInt();
		ac.setAccountnum(accNum);
		System.out.println("Enter the Pin Number ");
		int pinNum = sc.nextInt();
		ac.setPin(pinNum);
		/*
		 * System.out.println("enter the balance"); int balance = sc.nextInt();
		 * ac.setBalance(balance);
		 */

	}
	public void login()
	{
		System.out.println("enter the account number");
		int accNum = sc.nextInt();
		System.out.println("enter pin number ");
		int pinNum = sc.nextInt();
		if(ac.login(accNum, pinNum))
		{
			do
			{
				System.out.println("Welcome"+accNum);
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. View Transaction History");
				System.out.println("5. Exit");
				System.out.print("Choose an option: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Current balance: $" + ac.checkBalance(accNum));
					break;
				case 2:
					System.out.print("Enter deposit amount: $");
					double depositAmount = sc.nextDouble();
					ac.deposit(depositAmount,accNum);
					break;
				case 3:
					System.out.print("Enter withdrawal amount: $");
					double withdrawalAmount = sc.nextDouble();
					ac.withdraw(withdrawalAmount,accNum);
					break;
				case 4:
					ac.showTransactionHistory();
					break;
				case 5:
					System.out.println("Goodbye!");
					break;
				default:
					System.out.println("Invalid option. Please try again.");
				}

				System.out.println();

			} while (choice != 5);

		}
	}
}
