//Write a program to input three numbers and print them in either ascending or descending order.
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,big,mid,small,choice;

        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

        if(a>b && a>c){
            big = a;
        }
        else if(b>c){
            big = b;
        }
        else {
            big = c;
        }

        if(a<b && a<c){
            small = a;
        }
        else if(b<c){
            small = b;
        }
        else {
            small = c;
        }

        mid = (a+b+c)-(big+small);

        System.out.println("MENU (List of choice)");
        System.out.println("Enter 1 for ascending order");
        System.out.println("Enter 2 for descending order");

        System.out.println("Enter your choice 1 0r 2:");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Numbers in ascending order: "+small+","+mid+","+big);
        }
        else if(choice == 2){
            System.out.println("Numbers in descending order: "+big+","+mid+","+small);
        }
    }
}
