import java.util.Scanner;

//38. Write a Program to enter two numbers and Interchange (swap) their values.
// I am discussing two methods here, try to write the program yourself in language of your choice.
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("The value of first number is " + a);
        System.out.println("The value of second number is " + b);

    }
}
