//3. Write a program to input a number and print its square and cube.
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,square,cube ;
        System.out.println("Enter a number");
        num = sc.nextInt();
        square = num*num;
        cube = num*num*num;
        System.out.println("Square is "+square);
        System.out.println("Cube is "+cube);


    }
}
