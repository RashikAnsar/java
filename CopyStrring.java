import java.util.Scanner;

// Write a program  to  Copy a String to another
public class CopyStrring {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();
        char original[] = str.toCharArray();
        int size = original.length;
        char copied[] = new char[size];

        for (int i = 0; i < size; i++) {
            copied[i] = original[i];
        }
        System.out.println("Given String: " + new String(original));
        System.out.println("Copied String: " + new String(copied));
    }
}