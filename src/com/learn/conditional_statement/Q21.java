// Write a program to enter marks in english, science, math's,
// Social Science and computer to print overall performance marks
// scored according to branch chosen.
// To calculate performance marks you have to add the specified percentage of scored marks for each subject as given.
// Total marks for each subject is 200
// Branch - Science, English = 15%, Science = 25% , Maths = 25%, social science = 10%, computer = 25%;
// Branch - Arts, English= 30%,Science=10%, Maths = 10%, Social Science = 40%, computer = 10%
package com.learn.conditional_statement;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("             Choose Your Branch              ");
        System.out.println("---------------------------------------------");
        System.out.println("              1. Science                     ");
        System.out.println("              2. Arts                        ");
        System.out.println("---------------------------------------------");

        int choice = sc.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Exiting program.");
            return;
        }

        System.out.println("Enter marks of English between (0 - 200):");
        double english = sc.nextInt();
        System.out.println("Enter marks of Science between (0 - 200):");
        double science = sc.nextInt();
        System.out.println("Enter marks of Maths between (0 - 200):");
        double math = sc.nextInt();
        System.out.println("Enter marks of Social Science between (0 - 200):");
        double social = sc.nextInt();
        System.out.println("Enter marks of Computer Science between (0 - 200):");
        double computer = sc.nextInt();

        if (!validateMarks(english, science, math, social, computer)) {
            System.out.println("Invalid marks. Marks should be between 0 and 200. Exiting program.");
            return;
        }

        if(choice == 1){
            double sciencePerformance = calculateMarksScience(english, science, math, social, computer);
            System.out.println("Your science percent is " + sciencePerformance);
        }
        else{
            double artsPerformance = calculateMarksArts(english, science, math, social, computer);
            System.out.println("Your arts performance is " + artsPerformance);
        }
    }

    public static double calculateMarksScience(double english, double science, double math, double social, double computer) {
        return (english * 0.15 + science * 0.25 + math * 0.25 + social * 0.10 + computer * 0.25 );
    }
    public static double calculateMarksArts(double english, double science, double math, double social, double computer) {
        return (english * 0.30 + science * 0.10 + math * 0.10 + social * 0.40 + computer * 0.10 );
    }
    public static boolean validateMarks(double english, double science, double math,double social, double computer) {
       return  english >= 0 && english <= 200 &&
               science >= 0 && science <= 200 &&
               math >= 0 && math <= 200 &&
               social >= 0 && social <= 200 &&
               computer >= 0 && computer <= 200;
    }
}
