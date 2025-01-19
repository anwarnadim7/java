import java.util.Scanner;

//13. Write a Program to input the temperature in Fahrenheit (f) and print its equivalent in Centigrade (c).
// Where c = (5/9) * (f-32)
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter the temperature in Centigrade (°C): ");
        double tempFahrenheit = sc.nextDouble();

        // Convert to Centigrade
        double tempCentigrade = 0.55 *tempFahrenheit - 32;

        // Display the result
        System.out.printf("The equivalent temperature in Centigrade is: %.2f°C%n", tempCentigrade);
    }
}
