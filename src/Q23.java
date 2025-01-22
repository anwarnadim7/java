import java.util.Scanner;

//23. Write a program to enter the number of 50, 25, 20, 10, and 5 paisa coins a person has and
// print the total value they would represent in rupees.
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 50 paisa Coin
        System.out.println("Enter how many 50 Paisa coin:");
        int fiftyPaisaCoin = sc.nextInt();

        // Input 25 paisa Coin
        System.out.println("Enter how many 25 Paisa coin:");
        int twentyFivePaisaCoin = sc.nextInt();

        // Input 20 paisa Coin
        System.out.println("Enter how many 20 Paisa coin:");
        int twentyPaisaCoin = sc.nextInt();

        // Input 10 paisa Coin
        System.out.println("Enter how many 10 Paisa coin:");
        int tenPaisaCoin = sc.nextInt();

        // Input 5 paisa Coin
        System.out.println("Enter how many 5 Paisa coin:");
        int fivePaisaCoin = sc.nextInt();

        // Calculate the total paisa
        int sumOfPaisa = (fiftyPaisaCoin * 50) + (twentyFivePaisaCoin * 25) +
                (twentyPaisaCoin * 20) + (tenPaisaCoin * 10) +
                (fivePaisaCoin * 5);

        // Convert paisa to rupees and paisa
        int rupees = sumOfPaisa / 100;
        int paisas = sumOfPaisa % 100;

        // Output the total value in rupees and paisa
        System.out.printf("The total amount is %d Rupees and %d Paisa.%n", rupees, paisas);
    }
}