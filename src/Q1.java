//1. Write a program to input two numbers and print their sum, product and difference.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b, sum,prod,diff;
        System.out.print("Enter an No. ");
        a = obj.nextInt();
        System.out.print("Enter Next No. ");
        b = obj.nextInt();

        sum = a + b;
        prod = a * b;
        diff = a-b;
        System.out.println("Sum is "+ sum );
        System.out.println("Product is " + prod );
        System.out.println("Difference is " + diff );
    }
}
