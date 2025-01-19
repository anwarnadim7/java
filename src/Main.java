import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter a No.");
        a = obj.nextInt();
        System.out.print("Enter b No.");
        b = obj.nextInt();
        c = a+b;
        System.out.println("Sum is "+c);
    }
}