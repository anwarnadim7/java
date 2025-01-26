//write a program to enter two three-digit number and print if middle digit of both the numbers is same
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter two three-digit number
        System.out.println("Enter first three digit number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second three digit number: ");
        int num2 = scanner.nextInt();

        int firstMid = (num1/10)%10;
        int secondMid = (num2/10)%10;

        if(firstMid == secondMid) {
            System.out.println("Middle digit of first number and middle digit of second number matched");
        }
        else {
            System.out.println("Middle digit of first number and middle digit of second number not matched");
        }
    }
}
