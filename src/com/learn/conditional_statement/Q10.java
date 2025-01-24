//Write a program to enter two digit number and print weather it is a palindrome or not
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two digit number :");
        int a = scanner.nextInt();

        if((a < 10) || (a>99))
        {
            System.out.println("Enter two digit number :");
        }
        else {
            int firstDigit = a%10;
            int secondDigit = a/10;

            if (secondDigit == firstDigit){
                System.out.println("Number is Palindrome");
            }
            else {
                System.out.println("Number is not Palindrome");
            }
        }



    }

}
