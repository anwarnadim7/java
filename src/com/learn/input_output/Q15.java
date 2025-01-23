package com.learn.input_output;

import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Enter the value of x
        System.out.println("Enter the value of X:");
        double  x = sc.nextDouble();

        // Calculate the numerator and denominator
        double sqrtX = Math.sqrt(x);
        double numerator = 6 * sqrtX + 4 * sqrtX + 2 * sqrtX + 10;
        double denominator = 5 * sqrtX + 3 * sqrtX + x;

        //Calculate the value of Y
        if(denominator != 0)
        {
            double y = numerator / denominator;
            System.out.println("The value of y is: " + y);

        }
        else {
            System.out.println("The denominator is zero;");
        }
        sc.close();
    }
}
