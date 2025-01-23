package com.learn.input_output;

import java.util.Scanner;

//31. Write a Program to enter distance in Kilometer (Km), meter (m) and centimeter (cm) and convert it to millimeters (mm).
// (1 Kilometer = 1000 meter, 1 meter = 100 centimeter & 1 centimeter = 10 millimeter).
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter Distance in Kilometer (km), Meter (m) and Centimeter (cm)
        System.out.println("Enter distance in kilometers (Km):");
        double distanceKm = sc.nextDouble();

        System.out.println("Enter distance in Meters (m):");
        double distanceMeter = sc.nextDouble();

        System.out.println("Enter distance in Centimeters (cm):");
        double distanceCm = sc.nextDouble();

        // Convert km to meter
        double totalMeter = distanceKm * 1000 + distanceMeter;

        // Convert total meter to total centimeters
        double totalCentimeter = totalMeter * 100 + distanceCm;

        // Convert total centimeters to millimeters
        double totalMillimeter = totalCentimeter * 10;

        // Output the result
        System.out.println("Total distance in millimeters: " + totalMillimeter);
    }
}
