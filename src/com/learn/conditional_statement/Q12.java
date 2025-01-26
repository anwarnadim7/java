//Write a program to enter four-digit number and print whether it is palindrome or not.
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter four-digit number
        System.out.println("Enter four digit number: ");
        int num = sc.nextInt();

        // Extract digits
        int lastDigit = num % 10;             // Get the last digit
        int secondLastDigit = (num / 10) % 10; // Get the second-last digit
        int secondFirstDigit = (num / 100) % 10; // Get the second digit from the beginning
        int firstDigit = num / 1000;          // Get the first digit

        // Check if the number is a palindrome
        if (firstDigit == lastDigit && secondFirstDigit == secondLastDigit) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
