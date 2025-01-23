package com.learn.input_output;

import java.util.Scanner;

// Write a Program to input a number and print the cube of its square root.
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input: Enter a Number
        System.out.println("Enter a Number:");
        double number = sc.nextDouble();

        //Square root of a number
        double sqrtNumber = Math.sqrt(number);

        //Cube of Square Root
        double cubeNumber = Math.pow(sqrtNumber, 3);

        System.out.println("The cube is " + cubeNumber);
    }
}
