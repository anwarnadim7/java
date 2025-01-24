//Write a program to input three numbers and print the biggest number
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input three numbers
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }
        else if(num1 > num2 && num1 >num3)
        {
            System.out.println("First number "+ num1 + " is bigger");
        }
        else if (num2 > num3)
        {
            System.out.println("Second number "+ num2 + " is bigger");
        }
        else {
            System.out.println("Third number "+ num3 + " is bigger");
        }

    }
}
