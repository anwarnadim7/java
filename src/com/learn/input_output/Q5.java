package com.learn.input_output;//Write a Program to input the values of A & B and print the cube of their sum and cube of their product.
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        int a,b,sum,prod;
        double cubesum,cubeprod;
        Scanner sc = new Scanner(System.in);
        //INPUT A
        System.out.println("Enter the first number");
        a = sc.nextInt();
        //INPUT B
        System.out.println("Enter the second number");
        b = sc.nextInt();
        //SUM
        sum = a+b;
        //PRODUCT
        prod = a*b;
        //CUBE of their SUM
        cubesum = Math.pow(sum,3);
        cubeprod = Math.pow(prod,3);
        System.out.println("Cube of the Sum of A & B is "+cubesum);
        System.out.println("Cube of the Prod of A & B is "+cubeprod);








    }
}
