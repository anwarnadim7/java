// Write a program to input the coefficient of a quadratic equation (Ax^2 + Bx +c, where a!= 0) and
// print the type of their roots and their roots.
//The roots are "Imaginery / not possible" when the value of D<0, they are "real and equal"
// when the value of D = 0 and are "real and different" when the value of D>0 (where D= b^2-4ac).
// The roots can be calculated using the formula given
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        double x1,x2;

        System.out.println("Enter 3 coefficient of quadratic equation:");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        if(a==0)
        {
            System.out.println("Not a quadratic equation");
        }
        else {
            d = b*b - 4*a*c;
            if (d<0)
            {
                System.out.println("Roots are imaginary or Roots can not be found");
            }
            else {
                x1 = (-b+Math.sqrt(d))/(2*a);
                x2 = (-b-Math.sqrt(d))/(2*a);
                System.out.println("Roots are "+x1+"&"+x2);
                if(d==0)
                {
                    System.out.println("Roots are real and equal");
                }
                else {
                    System.out.println("Roots are real and different");
                }
            }
        }
    }
}
