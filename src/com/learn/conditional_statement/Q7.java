//A year that is divisible by 4 is known as leap year (e.g. 1988,1992,1996), but if it is also divisible by 100 then
// it is not a leap year(e.g. 1700, 1800, 1900), but if it is also divisible by 400 then it is a leap year
// (e.g. 1600,2000,2400). Write a program to enter a year and print whether it is a leap year of not
//hint: A simpler way to look at the definition of leap year would be that any year divisible 100
// is considered a leap year only if it is divisible by 400 also and the one not divisible by 100 is considered
// a leap yeas only if it is divisible by 4. )
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter a year
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if(year % 4 ==0 && year % 400 == 0)
        {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
