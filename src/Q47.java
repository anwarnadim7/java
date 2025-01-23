import java.util.Scanner;

//47. Write a Program to enter number of days and convert it to years, months, weeks & days (e.g. 452 days equals 1 year, 2 months, 3 weeks & 6 days).
// \Assume that 1 year = 365 days & 1 month = 30 days and 1 week = 7 days.
public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem_days;
        System.out.println("Enter number of days:");
        int days = sc.nextInt();

        int years = days / 365;
        rem_days = days % 365 ; // Remaining Days

        int months  = rem_days / 30;
        rem_days = rem_days % 30; // Remaining Days

        int weeks  = rem_days / 7;
        rem_days = rem_days % 7; //Remaining Days

        System.out.print( days + " days equals ") ;
        System.out.print( years + " years ") ;
        System.out.print( months + " months ") ;
        System.out.print( weeks + " weeks ") ;
        System.out.print( rem_days + " days") ;
    }
}
