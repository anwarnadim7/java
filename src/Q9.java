//9. Your friend has three cows.
// Second cow gives 1.5 times the milk of first cow and third cow gives 1.5 times the milk of second cow.
// Write a Program to print the total amount of milk that will accumulate if the first cow gives 8 liters of milk.

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        // Milk produced by the first cow
        double firstCowMilk = 8;

        // Milk produced by the second and third cows
        double secondCowMilk = 1.5 * firstCowMilk;
        double thirdCowMilk = 1.5 * secondCowMilk;

        // Calculate the total milk produced
        double totalMilk = firstCowMilk + secondCowMilk + thirdCowMilk;

        // Display the result
        System.out.printf("The total milk produced by all three cows is: %.2f liters%n", totalMilk);
    }
}

