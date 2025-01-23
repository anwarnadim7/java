package com.learn.input_output;

import java.util.Scanner;

// 22. Calculate Take Home Pay from Basic Salary
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Enter Basic Salary
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // DA (Dearness Allowance) calculation: 98% of Basic Salary
        double da = basicSalary * 0.98;

        // HRA (House Rent Allowance) calculation: 20% of (Basic Salary + DA)
        double hra = (basicSalary + da) * 0.20;

        // Gross Pay calculation: Basic Salary + HRA + DA
        double grossPay = basicSalary + hra + da;

        // PF (Provident Fund) calculation: 8.33% of (Basic Salary + DA)
        double pf = (basicSalary + da) * 0.0833;

        // IT (Income Tax) calculation: 20% of Gross Pay
        double it = grossPay * 0.20;

        // Deductions calculation: PF + IT
        double deductions = pf + it;

        // Take Home Pay calculation: Gross Pay - Deductions
        double takeHomePay = grossPay - deductions;

        // Output the Take Home Pay
        System.out.println("Take Home Pay (after deductions) is: " + takeHomePay);

        // Close the Scanner
        sc.close();
    }
}