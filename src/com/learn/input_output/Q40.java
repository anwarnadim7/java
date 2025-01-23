package com.learn.input_output;

//40. Write a Program to take a three digit number and print it in reverse order.
public class Q40 {
    public static void main(String[] args) {
        int n,a,b,c, reverse;

        n=342;

        a = n % 10; // LAST DIGIT
        b = (n / 10)%10; // MIDDLE DIGIT
        c = n/100; // First Digit
        reverse = a*100+b*10+c;
        System.out.println(reverse);


    }
}
