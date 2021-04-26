import java.util.Scanner;

// Write a program to find a given string length(Without String class ).
public class StringLength {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        s.close();

        int i = 0;

        for (char ch : str.toCharArray()) {
            i++;
        }

        System.out.println("Length of given string: " + i);
    }
}
