import java.util.Scanner;

//34. Given that: 1+2+3+4+⋯………….+n = n∗(n+1 )/2,
// Write a Program to enter a number n and print the sum of all integers from 1 to n.
public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter the number n
        System.out.println("Enter number n:");
        int n = sc.nextInt();

        int sum = n*(n+1)/2;
        System.out.println("The sum of the digits is: " + sum);
    }
}
