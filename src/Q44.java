import java.util.Scanner;

//44. Write a Program to input a three digit number and print the difference
// between the sum of digits of the number and product of digits of its reverse.
public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a three-digit number
        System.out.println("Enter a three-digit number: ");
        int number = sc.nextInt();

        // Extract digits of the number
        int firstDigit = number / 100;        // Hundreds place
        int middleDigit = (number / 10) % 10; // Tens place
        int lastDigit = number % 10;         // Units place

        // Calculate the sum of the digits
        int sumOfDigits = firstDigit + middleDigit + lastDigit;

        // Reverse the number
        int reversedNumber = lastDigit * 100 + middleDigit * 10 + firstDigit;

        // Extract digits of the reversed number
        int reverseFirstDigit = reversedNumber / 100;
        int reverseMiddleDigit = (reversedNumber / 10) % 10;
        int reverseLastDigit = reversedNumber % 10;

        // Calculate the product of the digits of the reversed number
        int productOfReversedDigits = reverseFirstDigit * reverseMiddleDigit * reverseLastDigit;

        // Calculate the difference
        int difference = sumOfDigits - productOfReversedDigits;

        // Print results
        System.out.println("Sum of digits of the original number: " + sumOfDigits);
        System.out.println("Product of digits of the reversed number: " + productOfReversedDigits);
        System.out.println("Difference: " + difference);
    }
}
