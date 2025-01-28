//Write a program to enter 2 separate time duration in Hours, Minutes and Seconds and print their sum.
// E.g. 13hr.50min 20sec  + 10hr 50 min50 sec. = 24hr.41 min 10 sec. Input all the units separately.

package com.learn.conditional_statement;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter two time durations separately in hours, minutes, and seconds
        System.out.println("Enter first duration in hours: ");
        int firstDurationHr = scanner.nextInt();
        System.out.println("Enter first duration in minutes: ");
        int firstDurationMin = scanner.nextInt();
        System.out.println("Enter first duration in seconds: ");
        int firstDurationSec = scanner.nextInt();

        System.out.println("Enter second duration in hours: ");
        int secondDurationHr = scanner.nextInt();
        System.out.println("Enter second duration in minutes: ");
        int secondDurationMin = scanner.nextInt();
        System.out.println("Enter second duration in seconds: ");
        int secondDurationSec = scanner.nextInt();

        // Calculate total seconds and convert excess seconds into minutes
        int totalDurationSec = firstDurationSec + secondDurationSec;
        int extraMinutes = totalDurationSec / 60;
        int remainingSec = totalDurationSec % 60;

        // Calculate total minutes and convert excess minutes into hours
        int totalDurationMinutes = firstDurationMin + secondDurationMin + extraMinutes;
        int extraHr = totalDurationMinutes / 60;
        int remainingMinutes = totalDurationMinutes % 60;

        // Calculate total hours
        int totalDurationHours = firstDurationHr + secondDurationHr + extraHr;

        // Print the result
        System.out.println("The sum of time duration is: "
                + totalDurationHours + " Hours, "
                + remainingMinutes + " Minutes, "
                + remainingSec + " Seconds.");
    }
}
