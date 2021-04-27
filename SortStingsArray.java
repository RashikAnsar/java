import java.util.Arrays;
import java.util.Scanner;

// Write a program to sorting String array
public class SortStingsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements in array: ");
        n = sc.nextInt();
        String[] strArray = new String[n];

        System.out.println("Enter all elements of the string: ");

        for (int i = 0; i < strArray.length; i++) {
            // Input only one word
            // If there is space consider it next element of the array.s
            strArray[i] = sc.next();
        }
        sc.close();

        System.out.println("Before Sorting: " + Arrays.toString(strArray));
        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 15; j < strArray.length; j++) {
                // The result is zero if the strings are equal; compareTo returns 0
                if (strArray[i].compareTo(strArray[j]) > 0) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        // Arrays.sort(strArray); // Builtin sort

        System.out.println("After Sorting: " + Arrays.toString(strArray));
    }
}
