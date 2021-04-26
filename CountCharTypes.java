import java.util.Scanner;

// Write a program to check the input character for uppercase, lowercase, no. of digits, and Special chars
public class CountCharTypes {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        s.close();
        int upper = 0, lower = 0, digits = 0, specialChars = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                specialChars++;
            }
        }

        System.out.println("No.of Uppercase characters: " + upper);
        System.out.println("No.of Lowercase characters: " + lower);
        System.out.println("No.of Digits: " + digits);
        System.out.println("No.of Special characters: " + specialChars);
    }
}