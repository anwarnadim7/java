//Write a program to enter two operands and an operator(*,-,+,/) and display the calculated result.
// (Hit: Use menu i.e. ask the user for choice of operators)
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input Numbers
        System.out.println("Enter first operands: ");
        double first = scanner.nextDouble();
        System.out.println("Enter second operands: ");
        double second = scanner.nextDouble();

        System.out.println("----------------Menu----------------");
        System.out.println(" 1. Multiplication ");
        System.out.println(" 2. Substraction ");
        System.out.println(" 3. Addition ");
        System.out.println(" 4. Division ");

        System.out.println("Enter your choice from 1 to 4");
        int choice = scanner.nextInt();
        if (choice == 1) {
            double multiplication = first * second;
            System.out.println("You've chosen multiplication");
            System.out.println("The result is: " + multiplication);
        }
        else if (choice == 2) {
            double substraction = first - second;
            System.out.println("You've chosen Substraction");
            System.out.println("The result is: " + substraction);
        }
        else if (choice == 3) {
            double addition = first + second;
            System.out.println("You've chosen Addition");
            System.out.println("The result is: " + addition);
        }
        else if (choice == 4) {
            double division = first / second;
            System.out.println("You've chosen Division");
            System.out.println("The result is: " + division);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
