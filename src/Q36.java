import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        int start = 8;  // Starting number
        int end = 100;  // Ending number

        // Calculate sum of squares from 8^2 to 100^2
        long totalSum = sumOfSquares(end) - sumOfSquares(start - 1);

        // Print the result
        System.out.println("The sum of squares from " + start + "^2 to " + end + "^2 is: " + totalSum);
    }
    // Method to calculate the sum of squares up to n
    public static long sumOfSquares(int n) {
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }
}
