import java.util.Scanner;

//16. Write a program to enter amount of purchase and print the amount payable
// if the shopkeeper gives a discount of 50% + 40%
// (This means that first you get a discount of 50% on the total value and then 40% on the remaining value
// that you have to pay after discount).
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input:Enter amount
        System.out.println("Enter enter amount of purchase: ");
        double purchaseAmount = sc.nextDouble();

        // Apply the first discount of 50%
        //double afterFirstDiscount = purchaseAmount * (1-0.50);
        double afterFirstDiscount = purchaseAmount * 0.50;

        // Apply the second discount of 40% on the remaining amount
        //afterSecondDiscount = afterFirstDiscount * (1 - 0.40)
        double afterSecondDiscount = afterFirstDiscount * 0.60;

        // The final amount payable
        System.out.println("The amount payable after both discounts is: " + afterSecondDiscount);

        sc.close();
    }
}
