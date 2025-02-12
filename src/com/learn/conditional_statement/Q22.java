//Write a program to input marks in 5 subjects
// of a candidate and print his/her percentage and grade.
// 80% and above implies Grade A, below 80% but 60% and above means Grade B,
// below 60% but 40% and above means Grade C and below 40% means Grade D
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q22 {

    // Constants for grade thresholds
    private static final double GRADE_A_THRESHOLD = 80;
    private static final double GRADE_B_THRESHOLD = 60;
    private static final double GRADE_C_THRESHOLD = 40;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for each subject
        System.out.println("Enter your English marks out of 100: ");
        double englishMarks = scanner.nextDouble();
        System.out.println("Enter your Maths marks out of 100: ");
        double mathsMarks = scanner.nextDouble();
        System.out.println("Enter your Science marks out of 100: ");
        double scienceMarks = scanner.nextDouble();
        System.out.println("Enter your History marks out of 100: ");
        double historyMarks = scanner.nextDouble();
        System.out.println("Enter your Geography marks out of 100: ");
        double geographyMarks = scanner.nextDouble();

        // Validate marks (each subject is out of 100)
        if (!validateMarks(englishMarks, mathsMarks, scienceMarks, historyMarks, geographyMarks)) {
            System.out.println("Invalid marks. Marks should be between 0 and 100. Exiting program.");
            return;
        }

        // Calculate total marks obtained and percentage
        double totalMarksObtained = englishMarks + mathsMarks + scienceMarks + historyMarks + geographyMarks;
        double percentage = (totalMarksObtained / 500) * 100;

        // Display total marks and percentage
        System.out.printf("Total marks obtained: %.2f%n", totalMarksObtained);
        System.out.printf("Percentage obtained: %.2f%%%n", percentage);

        // Determine and display grade
        String grade = determineGrade(percentage);
        System.out.printf("Your percentage is %.2f%% and Grade is %s%n", percentage, grade);
    }

    // Method to validate marks (each subject is out of 100)
    private static boolean validateMarks(double englishMarks, double mathsMarks, double scienceMarks,
                                         double historyMarks, double geographyMarks) {
        return englishMarks >= 0 && englishMarks <= 100 &&
                mathsMarks >= 0 && mathsMarks <= 100 &&
                scienceMarks >= 0 && scienceMarks <= 100 &&
                historyMarks >= 0 && historyMarks <= 100 &&
                geographyMarks >= 0 && geographyMarks <= 100;
    }

    // Method to determine grade based on percentage
    private static String determineGrade(double percentage) {
        if (percentage >= GRADE_A_THRESHOLD) {
            return "A";
        } else if (percentage >= GRADE_B_THRESHOLD) {
            return "B";
        } else if (percentage >= GRADE_C_THRESHOLD) {
            return "C";
        } else {
            return "D";
        }
    }
}