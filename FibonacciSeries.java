import java.util.Scanner;

// Write a program to print the Fibonacci series
public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Number of terms from Fibonacci Series to print: ");
        n = s.nextInt();
        s.close();

        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
