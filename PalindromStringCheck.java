import java.util.*;

public class PalindromStringCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String name = sc.nextLine();

        String reverseString = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverseString = reverseString + name.charAt(i);
        }

        if (name.equals(reverseString)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        sc.close();
    }
}