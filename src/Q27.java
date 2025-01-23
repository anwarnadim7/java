import java.util.Scanner;

//27. Write a Program to input length in meters and centimeters and print its equivalent length in feet.
// (1 feet = 12 inches, 1 inch = 2.54 cm, 100 cm = 1 m).
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input length in meters and centimeters
        System.out.print("Enter length in meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter length in centimeters: ");
        double centimeters = sc.nextDouble();

        // Convert meters and centimeters to total centimeters
        double totalCm = (meters * 100) + centimeters;

        // Convert total centimeters to inches
        double totalInches = totalCm / 2.54;

        // Convert inches to feet
        double totalFeet = totalInches / 12;

        // Output the result
        System.out.printf("Equivalent length in feet: %.2f\n", totalFeet);

    }
}
