//39. Write a Program to take a two digit number and print its digits in reverse order.
public class Q39 {
    public static void main(String[] args) {
        int n = 24;

        int a = n / 10; // IT WILL REMOVE THE LAST DIGIT AND GIVE FIRST DIGIT

        int b = n % 10; // IT WILL REMOVE THE FIRST DIGIT AND GIVE LAST DIGIT

        int reverse = b * 10 + a;
        System.out.println(reverse);
    }
}
