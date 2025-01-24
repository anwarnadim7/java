//Write a program to input three numbers and print the smallest number.
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input three number
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }
        else if( num1 < num2 && num1<num3)
        {
            System.out.println("First number "+num1 + " is smaller");
        }
        else if(num2<num3)
        {
            System.out.println("Second number "+num2 + " is smaller");
        }
        else {
            System.out.println("Third number "+num3 + " is smaller");
        }

    }
}
