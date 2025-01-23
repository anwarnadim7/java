package com.learn.input_output;

import java.util.Scanner;

//26. Given that a = 2*b, b = 5*c*d, c = 2*d*e, e = 7*d.
// Write a program to input required values and print the final values of a, b, c, d & e.
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c,d,e;

        //Input d:
        System.out.println("Enter the value of d:");
        d = sc.nextInt();

        //calculate the value of e
        e=7*d;

        //calculate the value of c
        c=2*d*e;

        //calculate the value of b
        b=5*c*d;

        //calculate the value of a
        a=2*b;

        // Output the values of a, b, c, d, and e
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
        System.out.println("The value of c: " + c);
        System.out.println("The value of d: " + d);
        System.out.println("The value of e: " + e);
    }
}
