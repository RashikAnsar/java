import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
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

        // built-in sort
        Arrays.sort(a);
        System.out.println("After Sorting: " + Arrays.toString(a));
    }
}
