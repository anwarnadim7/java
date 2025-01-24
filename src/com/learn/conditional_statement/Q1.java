//Write a  program to input two numbers and print bigger number
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input: Enter two Numbers
        System.out.println("Enter First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        //if a > b
        if(firstNumber > secondNumber){
            System.out.println("First number " +firstNumber+ " is bigger");
        }
        else {
            System.out.println("Second number " +secondNumber+ " is bigger");
        }

    }
}
