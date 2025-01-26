//Write a program to enter three-digit number and print whether it is palindrome or not.
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three-digit number
        System.out.println("Enter a three-digit number: ");
        int a = scanner.nextInt();

        // Extract digits
        int lastDigit = a % 10;            // Get the last digit
        int middleDigit = (a / 10) % 10;  // Get the middle digit
        int firstDigit = a / 100;         // Get the first digit

        // Check if the number is a palindrome
        if (firstDigit == lastDigit) {
            System.out.println(a + " is a palindrome.");
        } else {
            System.out.println(a + " is not a palindrome.");
        }
    }
}
