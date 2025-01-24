//Write a program to input weight of a person in kilograms and print "Overweight" if it is greater than 75, print "Underweight"
// if it is less than 40 else print "Normal weight".
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input: Weight
        System.out.println("Enter weight :");
        int weight = scanner.nextInt();

        if (weight > 75)
        {
            System.out.println("Overweight");
        }
        else if(weight < 40)
        {
            System.out.println("Underweight");
        }
        else {
            System.out.println("Normal Weight");
        }
    }
}
