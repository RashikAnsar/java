import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // variable declaration
        int n, max;
        Scanner s = new Scanner(System.in);

        // Input n elements
        System.out.print("Enter number of elements in the array: ");
        n = s.nextInt();

        // Create an array of input size
        int a[] = new int[n];
        System.out.println("Enter elements of array: ");

        // take array elements
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        s.close();

        // compare and update max
        max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum value among list: " + max);
    }
}