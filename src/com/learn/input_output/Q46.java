package com.learn.input_output;

import java.util.Scanner;

//46. Write a Program to input number of years, months, weeks and days and
// print total number of days it represents. For example if we entered 5 years, 8 months, 2 weeks and 3 days,
// it would mean 2082 days
// (Take 1 year = 365 days, 1 month = 30 days and 1 week = 7 days).
public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input years, months, weeks, and days
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        System.out.print("Enter number of weeks: ");
        int weeks = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        // Convert all to days
        int totalDays = (years * 365) + (months * 30) + (weeks * 7) + days;

        // Print the total number of days
        System.out.println("Total number of days: " + totalDays);



    }
}
