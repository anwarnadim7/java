package com.learn.input_output;

//37. Using the above formula write a program to print the result of following series:
// (8^2+9^2 +10^2 +⋯ +30^2)+(82^2)+(89^2 +90^2 +⋯+100^2)+(27^2 + 28^2 +   ……+41^2)
public class Q37 {
    public static void main(String[] args) {
        // Series ranges
        int startFirst = 8;
        int endFirst = 30;
        int startSecond = 82;
        int endSecond = 82;
        int startThird = 89;
        int endThird = 100;
        int startFourth = 27;
        int endFourth = 41;

        // Calculate each part of the series
        long sumFirst = calculateRangeSum(startFirst, endFirst);
        long sumSecond = calculateRangeSum(startSecond, endSecond);
        long sumThird = calculateRangeSum(startThird, endThird);
        long sumFourth = calculateRangeSum(startFourth, endFourth);

        // Total sum
        long totalSum = sumFirst + sumSecond + sumThird + sumFourth;

        // Print results
        System.out.println("The result of the series is: " + totalSum);
    }

    // Method to calculate the sum of squares up to n
    public static long sumOfSquares(int n) {
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }

    // Method to calculate the sum of squares for a range [start, end]
    public static long calculateRangeSum(int start, int end) {
        return sumOfSquares(end) - sumOfSquares(start - 1);
    }
}
