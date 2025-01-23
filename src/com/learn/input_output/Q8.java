package com.learn.input_output;

import java.util.Scanner;

//Write a program to enter sides of the triangle and print its area.
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter the first side of the triangle (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter the second side of the triangle (b): ");
        double b = sc.nextDouble();
        System.out.print("Enter the third side of the triangle (c): ");
        double c = sc.nextDouble();

        // Check if the sides form a valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Calculate the area using Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            // Display the area
            System.out.printf("The area of the triangle is: %.2f%n", area);
        }else{
            // Invalid triangle condition
            System.out.println("The entered sides do not form a valid triangle.");
        }
    }
}
