package com.learn.input_output;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constants for shirt price and discount
        final double SHIRT_PRICE = 500.0;
        final double DISCOUNT_PERCENTAGE = 12.5;

        // Calculate the price of one shirt after the discount
        double discountedPrice = SHIRT_PRICE * (1 - DISCOUNT_PERCENTAGE / 100);

        // Input the number of shirts purchased
        System.out.print("Enter the number of shirts purchased: ");
        int numOfShirts = sc.nextInt();

        // Calculate the total amount payable
        double totalAmount = numOfShirts * discountedPrice;

        // Display the result
        System.out.printf("The total amount payable is: ₹%.2f%n", totalAmount);
    }
}
