package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.Scanner;

public class FinanceApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Portfolio portfolio = new Portfolio("My Portfolio", "John Doe");

        int choice = 0;
        while (choice != 4) {
            System.out.println("Choose an asset type to add:");
            System.out.println("1. Bank Account");
            System.out.println("2. Credit Card");
            System.out.println("3. House");
            System.out.println("4. Exit and calculate total value");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter account name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();
                    portfolio.add(new BankAccount(name, accountNumber, balance));
                    System.out.println("Bank account added.");
                    break;
                }
                case 2: {
                    System.out.print("Enter credit card name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter credit card number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter credit card balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();
                    portfolio.add(new CreditCard(name, accountNumber, balance));
                    System.out.println("Credit card added.");
                    break;
                }
                case 3: {
                    System.out.print("Enter house name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter house value: ");
                    double value = scanner.nextDouble();
                    System.out.print("Enter year built: ");
                    int yearBuilt = scanner.nextInt();
                    System.out.print("Enter square feet: ");
                    int squareFeet = scanner.nextInt();
                    System.out.print("Enter number of bedrooms: ");
                    int bedrooms = scanner.nextInt();
                    scanner.nextLine();
                    portfolio.add(new House(name, value, yearBuilt, squareFeet, bedrooms));
                    System.out.println("House added.");
                    break;
                }
                case 4:
                    System.out.println("Portfolio Summary:");
                    System.out.println("Total value of portfolio: " + portfolio.getValue());
                    System.out.println("Most valuable asset: " + portfolio.getMostValuable());
                    System.out.println("Least valuable asset: " + portfolio.getLeastValuable());
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}