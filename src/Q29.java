import java.util.Scanner;

//29. Write a Program to input weight in Kilograms and grams and print its equivalent in Ounces.
// (1 pound (lbs.) = 16 ounces, 1 ounce = 28.35 grams, 1000 grams = 1 Kilogram).
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input weight in kilogram and grams
        System.out.print("Enter weight in kilograms: ");
        double kg = sc.nextDouble();

        System.out.print("Enter height in grams: ");
        double grams = sc.nextDouble();

        // Convert kilograms to total grams
        double totalGrams = (kg * 1000) + grams;

        //Convert totalGrams to ounce
        double totalOunce = totalGrams/28.35;

        System.out.println("Total weight in Ounce: " + totalOunce);

    }
}
