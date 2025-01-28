//Write a program to input a number and print the sum of digits at hundredth
// and thousandth position. Number entered cannot be less than 1000.
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter a number
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n < 1000) {
            System.out.println("Number is less than 1000. Please enter a valid number.");
        } else {
            // Extract the digit at the hundredth position
            int hundredthDigit = (n / 100) % 10;
            // Extract the digit at the thousandth position
            int thousandthDigit = (n / 1000) % 10;

            // Calculate the sum
            int sum = hundredthDigit + thousandthDigit;

            // Print the result
            System.out.println("The digit at the hundredth position is: " + hundredthDigit);
            System.out.println("The digit at the thousandth position is: " + thousandthDigit);
            System.out.println("The sum of the digits at hundredth and thousandth positions is: " + sum);
        }
    }
}
