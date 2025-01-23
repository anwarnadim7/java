package com.learn.input_output;

import java.util.Scanner;

//42. Write a Program to enter an amount in rupees and print minimum number of currency of ₹2000, ₹500, ₹100, ₹50 and ₹1
// that will be equivalent to the amount entered.
public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the amount in rupees
        System.out.println("Enter the amount in rupees: ");
        int amount = sc.nextInt();

        // Currency denominations
        int note2000 = amount / 2000;
        amount %= 2000;

        int note500 = amount / 500;
        amount %= 500;

        int note100 = amount / 100;
        amount %= 100;

        int note50 = amount / 50;
        amount %= 50;

        int note1 = amount; // Remaining amount is in ₹1 coins

        // Print the results
        System.out.println("Minimum number of currency notes/coins:");
        System.out.println("₹2000: " + note2000);
        System.out.println("₹500: " + note500);
        System.out.println("₹100: " + note100);
        System.out.println("₹50: " + note50);
        System.out.println("₹1: " + note1);
    }
}
