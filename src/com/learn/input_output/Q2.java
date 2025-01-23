package com.learn.input_output;//2. Write a program to input two numbers and print product of their sum and difference.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        int a,b,sum,prod,diff;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a No. ");
        a = sc.nextInt();
        System.out.println("Enter Next No. ");
        b = sc.nextInt();
        sum = a+b;
        diff = a - b;
        prod = sum * diff;

        System.out.println("Result is "+prod);
    }
}
