package com.learn.input_output;

//41. Write a Program to take a four digit number and print it in reverse order.
public class Q41 {
    public static void main(String[] args) {
        int a,b,c,d,reverse,n;
        n = 2345;

        a = n%10;            //First Digit
        b = ((n/10)%10);    //  Second
        c = ((n/10)/10)%10; // Third
        d = n/1000;

        reverse = a*1000+b*100+c*10+d;
        System.out.println(reverse);

    }
}
