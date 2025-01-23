import java.util.Scanner;

//45. Write a Program to input a four digit number (assume that correct number is entered)
// and print it after swapping the first digit with the last digit.
// For example if the input was 1234 then the output will be 4231.
public class Q45 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the four digit number:");
     int number = sc.nextInt();

     int firstDigit = number / 1000;
     int middleDigit = (number / 10)%100;
     int lastDigit = number % 10;

     //Swap number
        int swap = lastDigit * 1000 +middleDigit *10 + firstDigit;
        System.out.println(swap);

    }
}
