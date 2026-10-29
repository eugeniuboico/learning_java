package Homework.hw8;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level") == true);
        System.out.println(isPalindrome("java") == false);
        System.out.println(isPalindrome("a") == true);
        System.out.println(isPalindrome("") == true);

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase(Locale.ROOT);
        int j = s.length() - 1;
        int i = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
