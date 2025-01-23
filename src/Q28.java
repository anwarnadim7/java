import java.util.Scanner;

//28. Write a Program to input length in Feet and Inches and print its equivalent length in meters.
// (1 feet = 12 inches, 1 inch = 2.54 cm, 100 cm = 1 m).
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input length in feet and inches
        System.out.print("Enter length in Feet: ");
        double feet = sc.nextDouble();

        System.out.print("Enter length in Inches: ");
        double inches = sc.nextDouble();

        // Convert feet to total inches
        double totalInches = (feet * 12) + inches;

        // Convert inches to centimeters
        double totalCm = totalInches * 2.54;

        // Convert centimeters to meters
        double totalMeters = totalCm / 100;

        // Output the result
        System.out.printf("Equivalent length in meters: %.2f\n", totalMeters);
    }
}
