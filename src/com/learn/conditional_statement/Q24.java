//Write a program to enter three angles of a triangle and check for the validity of the triangle.
//make sure by checking in your program that all angles are positive
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angles of the triangle
        System.out.println("Enter first angle (in degrees):");
        double angle1 = scanner.nextDouble();
        System.out.println("Enter second angle (in degrees):");
        double angle2 = scanner.nextDouble();
        System.out.println("Enter third angle (in degrees):");
        double angle3 = scanner.nextDouble();

        // Check if any angle is zero or negative
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            System.out.println("Invalid triangle: Angles must be positive.");
            return;
        }

        // Calculate the sum of the angles
        double sum = angle1 + angle2 + angle3;

        // Check if the sum of angles is exactly 180 degrees
        if (sum == 180) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Invalid triangle: Sum of angles must be 180 degrees.");
        }
    }
}
