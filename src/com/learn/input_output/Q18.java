package com.learn.input_output;

import java.util.Scanner;

//18. Write a Program to enter the values of u (object distance)
// & v (image distance) and print the value of f (focal length)
// where 1/f=1/u + 1/v
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input:Enter Object Distance (U)
        System.out.println("Enter Object Distance (u):");
        double u = sc.nextDouble();

        //Input:Enter Image Distance (v)
        System.out.println("Enter Image Distance (v):");
        double v = sc.nextDouble();

        // Calculate the reciprocal of the focal length (1/f)
        double reciprocalF = (1/u)+(1/v);

        // Calculate the focal length (f)
        if (reciprocalF != 0) {
            double f = 1 / reciprocalF;
            System.out.println("The focal length (f) is: " + f);
        } else {
            System.out.println("The focal length is undefined (1/f = 0).");
        }
    }
}
