/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

//program that scans item's price and quantity based on user input
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        cashier cashier = new cashier(); //in order to call non-static method from main
        String choice = "y"; //choice for user to keep scanning items or quit
        while (choice.equals("y")) {
            System.out.print("Enter item's price: ");
            double price = input.nextDouble();
            input.nextLine();//consumers newline character
            System.out.print("Enter item quantity: ");
            int quantity = input.nextInt();
            input.nextLine(); //consumes newline character
            cashier.addSubtotal(price, quantity);
            System.out.print("Enter Y to continue scanning items or anything else to quit: ");
            choice = input.nextLine().trim().toLowerCase();
        }
        double subtotal = cashier.getSubtotal();
        double tax = cashier.getTax();
        double total = cashier.getTotal();
        System.out.printf("Subtotal: $%.2f%nTax: $%.2f%nTotal: $%.2f%n", subtotal, tax, total);
    }
}
