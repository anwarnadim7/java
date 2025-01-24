//Write a program to input a number and print whether it is "Positive", "Negative", "Zero".
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input:numbers
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num<0)
        {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
