package com.learn.input_output;

import java.util.Scanner;

// Write a program to enter amount of purchase and print the amount
// payable if the shopkeeper gives discount of 40% + 40% + 20%.
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter Amount of Purchase
        System.out.println("Enter the Amount of Purchase:");
        double amountPurchase = sc.nextDouble();

        //First 40% Discount
        double firstDiscount = amountPurchase * 0.60;

        //Second 40% Discount
        double secondDiscount = firstDiscount * 0.60;

        //Third 20% Discount
        double thirdDiscount = secondDiscount * 0.80;

        // The final amount payable
        System.out.println("The amount payable after all discounts is: " + thirdDiscount);
    }
}
