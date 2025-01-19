import java.util.Scanner;

//6. Write a Program to input two numbers and print the sum of 30% of each number.
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number. ");
        int a = sc.nextInt();
        System.out.println("Enter the second number. ");
        int b = sc.nextInt();
        double sum = 0.3*a+0.3*b;
        System.out.println("The sum is: " + sum);
    }
}
