//Write a program to compute the net amount paid by the customer.
// Assuming all required values to be provided by the user.
// An electric goods show room has announced the following festive discount % on the purchase of items:
// RANGE           OVEN,REFRIGERATOR and WASHING MACHINE          TV, Projector & Music System       Tablets, Mobile Phone, Radios & Mp3, Mp4 Players
// <= 10000                      5%                                         0%                                      10%
// <= 50000                     15%                                        10%                                      20%
// <= 100000                    20%                                        15%                                      30%
// above 100000                 25%                                        20%                                      40%

//This Program  can be attempted in two different ways. Try to write separate program for both ways
//1. Accept the category of products through menu and print the output assuming that a customer will purchase in any one category only.
//2. Accept input for each category separately and calculate the amount to paid, also separately.
// Print the total amount to be paid by adding amount of all the categories if a person does not purchase in a category than enter the amount of purchase as Zero (0)
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q23_1 {

    // Constants for discount percentages
    private static final double CATEGORY_1_DISCOUNT_1 = 0.05;  // <= 10000
    private static final double CATEGORY_1_DISCOUNT_2 = 0.15;  // <= 50000
    private static final double CATEGORY_1_DISCOUNT_3 = 0.20;  // <= 100000
    private static final double CATEGORY_1_DISCOUNT_4 = 0.25;  // > 100000

    private static final double CATEGORY_2_DISCOUNT_1 = 0.00;  // <= 10000
    private static final double CATEGORY_2_DISCOUNT_2 = 0.10;  // <= 50000
    private static final double CATEGORY_2_DISCOUNT_3 = 0.15;  // <= 100000
    private static final double CATEGORY_2_DISCOUNT_4 = 0.20;  // > 100000

    private static final double CATEGORY_3_DISCOUNT_1 = 0.10;  // <= 10000
    private static final double CATEGORY_3_DISCOUNT_2 = 0.20;  // <= 50000
    private static final double CATEGORY_3_DISCOUNT_3 = 0.30;  // <= 100000
    private static final double CATEGORY_3_DISCOUNT_4 = 0.40;  // > 100000

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display product categories
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                          Enter Your Product Category                          ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                          1. Oven, Refrigerator & Washing Machine              ");
        System.out.println("                          2. Tv, Projector & Music System                      ");
        System.out.println("                          3. Tablets, Mobile Phone, Radios & Mp3 and Mp4       ");
        System.out.println("-------------------------------------------------------------------------------");

        // Input category
        System.out.print("Enter your choice (1, 2, or 3): ");
        int category = scanner.nextInt();

        // Validate category
        if (category < 1 || category > 3) {
            System.out.println("Invalid category. Exiting program.");
            return;
        }

        // Input product price
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        // Calculate and display the net amount to be paid
        double netAmount = calculateAmount(price, category);
        System.out.printf("Net amount to be paid: %.2f%n", netAmount);
    }

    // Method to calculate the net amount based on category and price
    private static double calculateAmount(double price, int category) {
        double discount = 0;

        if (category == 1) {
            if (price <= 10000) {
                discount = price * CATEGORY_1_DISCOUNT_1;
            } else if (price <= 50000) {
                discount = price * CATEGORY_1_DISCOUNT_2;
            } else if (price <= 100000) {
                discount = price * CATEGORY_1_DISCOUNT_3;
            } else {
                discount = price * CATEGORY_1_DISCOUNT_4;
            }
        } else if (category == 2) {
            if (price <= 10000) {
                discount = price * CATEGORY_2_DISCOUNT_1;
            } else if (price <= 50000) {
                discount = price * CATEGORY_2_DISCOUNT_2;
            } else if (price <= 100000) {
                discount = price * CATEGORY_2_DISCOUNT_3;
            } else {
                discount = price * CATEGORY_2_DISCOUNT_4;
            }
        } else if (category == 3) {
            if (price <= 10000) {
                discount = price * CATEGORY_3_DISCOUNT_1;
            } else if (price <= 50000) {
                discount = price * CATEGORY_3_DISCOUNT_2;
            } else if (price <= 100000) {
                discount = price * CATEGORY_3_DISCOUNT_3;
            } else {
                discount = price * CATEGORY_3_DISCOUNT_4;
            }
        }

        return price - discount;
    }
}
