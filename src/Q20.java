import java.util.Scanner;

// 20. Write a Program to input a number and print the cube of its square root
// of its cube root of its square root.
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Enter the number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Perform calculations
        double squareRoot = Math.sqrt(number); // Square root of the number
        double cubeRootOfSquareRoot = Math.cbrt(squareRoot); // Cube root of the square root
        double squareRootOfCubeRoot = Math.sqrt(cubeRootOfSquareRoot); // Square root of the cube root
        double finalResult = Math.pow(squareRootOfCubeRoot, 3); // Cube of the result

        // Output the result
        System.out.println("The cube of its square root of its cube root of its square root is: " + finalResult);

        sc.close();
    }
}