package com.learn.input_output;

//35. Given that: 1+ 2+ 3+4 +⋯………….+n =n ∗(n+1 )/2
// Write a Program to determine the value of 10 + 11 + 12 + . . . . . . + 50.
public class Q35 {
    public static void main(String[] args) {

        int start = 10;
        int end = 50;

        // Calculate the sum using the formula for the sum of the first n integers
        int sumEnd = (end * (end + 1)) / 2; // Sum from 1 to 50
        int sumStart = ((start - 1) * start) / 2; // Sum from 1 to 9

        // The sum from 10 to 50 is the difference of the above two sums
        int sum = sumEnd - sumStart;

        // Output the result
        System.out.println("The sum of integers from 10 to 50 is: " + sum);
    }
}
