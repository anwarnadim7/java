//43. Write a Program to enter a number and print the sum of digits at hundredth and thousandth position.
// (Assume that number entered is never less than 1000).
import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.println("Enter a number (not less than 1000): ");
        int number = sc.nextInt();

        // Extract digits
        int hundredthDigit = (number / 100) % 10; // Digit at hundredth position
        int thousandthDigit = (number / 1000) % 10; // Digit at thousandth position

        // Calculate the sum
        int sum = hundredthDigit + thousandthDigit;

        // Print the results
        System.out.println("Hundredth digit: " + hundredthDigit);
        System.out.println("Thousandth digit: " + thousandthDigit);
        System.out.println("Sum of digits at hundredth and thousandth positions: " + sum);
    }
}