/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

public class cashier {
    private double subtotal = 0;
    private double tax = 0;
    private double total = 0;

    public void addSubtotal(double price, int quantity) {
        this.subtotal += price * quantity;
        this.tax = 5.5 * subtotal / 100;
        this.total = subtotal + tax;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTax() {
        return tax;
    }

    public double getTotal() {
        return total;
    }
}
