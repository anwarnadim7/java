import java.util.Scanner;

//30. Write a Program to input weight in Pounds (lbs.) and ounces and print its equivalent in Kilograms. (
// 1 lbs. = 16 ounces, 1 ounce = 28.35 grams, 1000 grams = 1 Kilogram).
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter weight in Pounds and Ounces
        System.out.println("Enter weight in pounds:");
        double weightPound = sc.nextDouble();

        System.out.println("Enter weight in ounces:");
        double weightOunces = sc.nextDouble();

        // Calculate total ounces (1 lb = 16 ounces)
        double totalOunce = (weightPound * 16) + weightOunces;

        // Convert total ounces to grams (1 ounce = 28.35 grams)
        double totalGrams = totalOunce * 28.35;

        // Convert grams to kilograms (1000 grams = 1 kilogram)
        double totalKg = totalGrams / 1000;

        // Output the result
        System.out.println("Total weight in kilograms: " + totalKg);
    }
}
