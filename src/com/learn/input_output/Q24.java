package com.learn.input_output;

import java.util.Scanner;

//24. A circle inside the triangle touching all the three sides of the triangle is known as Inscribed circle
// and a circle outside the triangle touching all the three corners of the triangle is known as Circumscribed circle.
// Radius of circumscribed circle is calculated by (a*b*c) / (4*AREA) and
// radius of Inscribed circle is calculated by AREA / s.
// Write a Program to print the area of the triangle, area of Inscribed and circumscribed circle.
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input sides of the triangle
        System.out.println("Enter the length of side a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the length of side b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the length of side c: ");
        double c = sc.nextDouble();

        //Calculate the semi perimeter
        double s = (a + b + c) / 2;

        //calculate the area of triangle
        double triangleArea = Math.sqrt(s * (s-a)*(s-b)*(s-c));

        //Calculate radius of circumscribed circle R
        double R = (a*b*c)/4*triangleArea;

        //Calculate radius of Inscribed circle r
        double r = triangleArea/s;

        // Calculate the areas of the Inscribed and Circumscribed circles
        double areaInscribedCircle = Math.PI * r * r;
        double areaCircumscribedCircle = Math.PI * R * R;

        // Output the results
        System.out.printf("Area of the triangle: %.2f\n", triangleArea);
        System.out.printf("Radius of the Inscribed Circle: %.2f\n", r);
        System.out.printf("Area of the Inscribed Circle: %.2f\n", areaInscribedCircle);
        System.out.printf("Radius of the Circumscribed Circle: %.2f\n", R);
        System.out.printf("Area of the Circumscribed Circle: %.2f\n", areaCircumscribedCircle);

    }
}
