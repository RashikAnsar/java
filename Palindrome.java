import java.util.Scanner;

// Write a program to find the given string is Palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        String givenString;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        givenString = s.nextLine();
        s.close();

        int i = 0, j = givenString.length() - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (givenString.charAt(i) != givenString.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println("Given string is a Palindrome");
        } else {
            System.out.println("Given string is not a Palindrome");
        }

    }
}
