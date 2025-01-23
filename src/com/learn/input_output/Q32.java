package com.learn.input_output;

import java.util.Scanner;

//32. Write a Program to input Loan amount taken, yearly rate of interest at which the loan
// is taken and tenure of loan in months and to print the Equated monthly instalment (EMI)
// that will need to paid every month to repay the loan in the specified tenure.
// Also print total interest that would be paid on the loan.   
// EMI= p∗ r∗ (1+r )^n /( (1+r )^n-1 )
// Where p is the loan amount, n is the tenure of loan (in months) and 
// r is monthly rate of interest (= yearly rate of interest/100/12).
// Total interest paid can be calculate by (EMI * n ) - p.
public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter Loan amount taken, yearly interest rate and tenure in months
        System.out.print("Enter the loan amount taken: ");
        double p = sc.nextDouble();

        System.out.print("Enter the loan interest rate per year: ");
        double loanInterestRate = sc.nextDouble();

        System.out.print("Enter the tenure in months: ");
        double n = sc.nextDouble();

        // Monthly interest rate (r = yearly rate / 100 / 12)
        double r = loanInterestRate / 100 / 12;

        // EMI calculation using the formula
        double emi = p * r * Math.pow((1 + r), n) / (Math.pow((1 + r), n) - 1);

        // Total interest paid calculation
        double totalInterest = (emi * n) - p;

        // Rounding the EMI and total interest to 2 decimal places
        emi = Math.round(emi * 100.0) / 100.0;
        totalInterest = Math.round(totalInterest * 100.0) / 100.0;

        // Display the results
        System.out.println("Equated Monthly Instalment (EMI) is: " + emi);
        System.out.println("Total interest paid over the loan tenure is: " + totalInterest);
    }
}
