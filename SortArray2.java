import java.util.Arrays;
import java.util.Scanner;

// Write a program to sort (Ascending order) given Array
public class SortArray2 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of elements in the array: ");
        n = s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter elements of array: ");

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        s.close();

        System.out.println("Before Sorting: " + Arrays.toString(a));

        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
