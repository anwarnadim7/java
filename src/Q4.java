//4. Write a program to input a number and print its square root & cube root.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sqroot,cuberoot;
        System.out.print("Enter a No. ");
        n = sc.nextInt();

        sqroot = Math.sqrt(n);
        cuberoot = Math.cbrt(n);
        System.out.println("Square Root is "+sqroot);
        System.out.println("Cube Root is "+cuberoot);

    }
}
