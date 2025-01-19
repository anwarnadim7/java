import java.util.Scanner;

// Program to calculate the sum of X% of the first number and Y% of the second number
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int numOne = sc.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int numTwo = sc.nextInt();

        // Input the percentage of the first number
        System.out.print("Enter X% of the first number: ");
        double xPer = sc.nextDouble();

        // Input the percentage of the second number
        System.out.print("Enter Y% of the second number: ");
        double yPer = sc.nextDouble();

        // Calculate the X% of the first number and Y% of the second number
        double xPerFirst = numOne * xPer / 100;
        double yPerSecond = numTwo * yPer / 100;

        // Calculate the sum
        double sum = xPerFirst + yPerSecond;

        // Display the result
        System.out.printf("The sum of %.2f%% of %d and %.2f%% of %d is: %.2f%n", xPer, numOne, yPer, numTwo, sum);
    }
}
