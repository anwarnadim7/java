package com.learn.input_output;

import java.util.Scanner;

// Program to calculate y based on the given formula
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the value of X
        System.out.print("Enter the value of X: ");
        double x = sc.nextDouble();

        // Calculate the numerator and denominator
        double numerator = Math.pow(x, 6) + Math.pow(x, 4) + Math.pow(x, 2) + 10;
        double denominator = Math.pow(x, 5) + Math.pow(x, 3) + x;

        // Calculate y
        if (denominator != 0) {
            double y = numerator / denominator;
            System.out.printf("The value of Y is: %.2f%n", y);
        } else {
            System.out.println("The denominator is zero, so Y is undefined.");
        }
    }
}
