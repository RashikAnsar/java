import java.util.Scanner;

// Write a program to Factorial of n numbers
public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer to find its factorial: ");
        n = s.nextInt();
        s.close();

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Factorial of " + n + " is " + result);

    }
}
