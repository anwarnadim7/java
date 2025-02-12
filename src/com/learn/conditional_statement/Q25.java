//Write a program to enter three sides of a triangle and check for the validity of triangle
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first sides of a triangle:");
        double side1 = scanner.nextInt();
        System.out.println("Enter second sides of a triangle:");
        double side2 = scanner.nextInt();
        System.out.println("Enter third sides of a triangle:");
        double side3 = scanner.nextInt();

        if (side1 + side2 > side3){}


    }
}
