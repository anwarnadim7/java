import java.util.Scanner;
//Write a Program to print the amount to be paid to purchase N shirts at ₹ X each having a discount of Y% on each shirt.
// Hint: Refer Question 7
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of shirts
        System.out.print("Enter the number of shirts: ");
        int numberOfShirts = sc.nextInt();

        // Input the price of each shirt
        System.out.print("Enter the price of each shirt (₹): ");
        double shirtPrice = sc.nextDouble();

        // Input the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discount = sc.nextDouble();

        // Calculate the price after discount
        double finalShirtPrice = shirtPrice * (1 - discount / 100);

        // Calculate the total amount to pay
        double amountToPay = finalShirtPrice * numberOfShirts;

        // Display the total amount
        System.out.printf("The total amount to be paid is: ₹%.2f%n", amountToPay);
    }
}
