import java.util.Scanner;

//33. Write a Program to input Years, months, weeks and days elapsed since your birth
// (Basically your age, accurate up to today) and print its equivalent in hours, minutes.
// (1 year = 365 days, 1 month = 30 days, 1 week = 7 days, 1 days = 24 hours and 1 hour = 60 minutes).
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter Years, Months, Weeks and Days elapsed
        System.out.println("Enter Years:");
        int years = sc.nextInt();

        System.out.println("Enter Months:");
        int months = sc.nextInt();

        System.out.println("Enter Weeks:");
        int weeks = sc.nextInt();

        System.out.println("Enter Days:");
        int days = sc.nextInt();

        // Calculate total days:
        int totalDays = (years * 365) + (months * 30) + (weeks * 7) + days;

        // Calculate total hours:
        int totalHours = totalDays * 24;

        // Calculate total minutes:
        int totalMinutes = totalHours * 60;

        // Output the results
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Minutes: " + totalMinutes);
    }
}
