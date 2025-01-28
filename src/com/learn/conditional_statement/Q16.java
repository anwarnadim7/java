package com.learn.conditional_statement;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two distances
        System.out.println("Enter first distance in Feet:");
        int firstDistanceInFeet = scanner.nextInt();

        System.out.println("Enter first distance in Inches:");
        int firstDistanceInInches = scanner.nextInt();

        System.out.println("Enter second distance in Feet:");
        int secondDistanceInFeet = scanner.nextInt();

        System.out.println("Enter second distance in Inches:");
        int secondDistanceInInches = scanner.nextInt();

        // Calculate the sum of distances
        int totalInches = firstDistanceInInches + secondDistanceInInches;
        int extraFeet = totalInches / 12; // Convert inches to feet if greater than or equal to 12
        int remainingInches = totalInches % 12;

        int totalFeet = firstDistanceInFeet + secondDistanceInFeet + extraFeet;

        // Print the result
        System.out.println("The sum of distances is: " + totalFeet + "'" + remainingInches + "\"");
    }
}
