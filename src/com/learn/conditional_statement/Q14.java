//Write a program to enter two separate distance in meters and centimeters and print their sum
// e.g. 10m 25cm + 12m 95cm = 23m 20cm
// Input both units meter & centimeter separately for both distances.

package com.learn.conditional_statement;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter data of first distance
        System.out.println("Enter data of first distance");
        System.out.println("Enter distance in meters: ");
        int firstDistanceMeter = scanner.nextInt();
        System.out.println("Enter distance in centimeters: ");
        int firstDistanceCentimeter = scanner.nextInt();

        //Enter data of second distance
        System.out.println("Enter data of second distance");
        System.out.println("Enter distance in meters: ");
        int secondDistanceMeter = scanner.nextInt();
        System.out.println("Enter distance in centimeters: ");
        int secondDistanceCentimeter = scanner.nextInt();

        if((firstDistanceMeter >= 0 && firstDistanceCentimeter >=0) && (secondDistanceMeter >= 0 && secondDistanceCentimeter >=0)){
            int meter = firstDistanceMeter + secondDistanceMeter + (firstDistanceCentimeter + secondDistanceCentimeter)/100;
            int centimeter = (firstDistanceCentimeter + secondDistanceCentimeter)%100;

            System.out.println("Total distance is " + meter +" meters and "+ centimeter +" centimeters");
        }
        else {
            System.out.println("Data entered is incorrect");
        }

    }
}
