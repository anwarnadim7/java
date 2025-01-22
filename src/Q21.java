import java.util.Scanner;

//21. A School conducts three term exams in a year.
// Final marks are calculated by giving different weightage to each term.
// First term has 10% weight, Second term has 20% weight and Final term has 70% weightage.
// Write a program to enter the marks of the three terms (each term of 900 marks) and print the final marks using weights given to each term.
// (Hint: Take 10% of marks scored in first term, 20% of second term, 70% of third term and print their sum).
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input:Enter the Marks of First Terms
        System.out.println("Enter the marks of First Terms:");
        double firstTermMarks = sc.nextDouble();

        // Validate First Term Marks
        if (firstTermMarks < 0 || firstTermMarks > 900) {
            System.out.println("Invalid marks for the First Term. Please enter a value between 0 and 900.");
            return;
        }

        //Input: Enter the Marks of Second Terms
        System.out.println("Enter the marks of Second Terms:");
        double secondTermMarks = sc.nextDouble();

        // Validate Second Term Marks
        if (secondTermMarks < 0 || secondTermMarks > 900) {
            System.out.println("Invalid marks for the Second Term. Please enter a value between 0 and 900.");
            return;
        }

        //Input: Enter the Marks of Third Terms
        System.out.println("Enter the marks of Third Terms:");
        double thirdTermMarks = sc.nextDouble();

        // Validate Third Term Marks
        if (thirdTermMarks < 0 || thirdTermMarks > 900) {
            System.out.println("Invalid marks for the Third Term. Please enter a value between 0 and 900.");
            return;
        }


        double result = (firstTermMarks*0.10 + secondTermMarks*0.20 + thirdTermMarks*0.70);
        System.out.println("The Result is :"+result);
    }
}
