//Write a program to input a number and print whether it is odd or even
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input : Enter a number
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        if(a%2==0)
        {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
