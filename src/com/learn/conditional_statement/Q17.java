//Write a program to enter 2 separate distances in Kilometer, meter & centimeter.
// Print their sum also in Kilometer, meter & centimeter. Input all the units separately.

package com.learn.conditional_statement;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter first distance
        System.out.println("Enter first distance in Kilometers:");
        int firstDistanceKm = scanner.nextInt();
        System.out.println("Enter first distance in Meters:");
        int firstDistanceMeter = scanner.nextInt();
        System.out.println("Enter first distance in Centimeters:");
        int firstDistanceCm = scanner.nextInt();

        // Enter second distance
        System.out.println("Enter second distance in Kilometers:");
        int secondDistanceKm = scanner.nextInt();
        System.out.println("Enter second distance in Meters:");
        int secondDistanceMeter = scanner.nextInt();
        System.out.println("Enter second distance in Centimeters:");
        int secondDistanceCm = scanner.nextInt();

        // Calculate total centimeters and convert to meters if needed
        int totalCentimeters = firstDistanceCm + secondDistanceCm;
        int extraMeters = totalCentimeters / 100;
        int remainingCentimeters = totalCentimeters % 100;

        // Calculate total meters and convert to kilometers if needed
        int totalMeters = firstDistanceMeter + secondDistanceMeter + extraMeters;
        int extraKilometers = totalMeters / 1000;
        int remainingMeters = totalMeters % 1000;

        // Calculate total kilometers
        int totalKilometers = firstDistanceKm + secondDistanceKm + extraKilometers;

        // Print the result
        System.out.println("The sum of distances is: " + totalKilometers + " kilometers, "
                + remainingMeters + " meters, "
                + remainingCentimeters + " centimeters.");
    }
}
