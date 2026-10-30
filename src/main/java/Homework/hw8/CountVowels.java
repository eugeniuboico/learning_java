package Homework.hw8;

import java.util.Locale;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println(countVowels("Java") == 2);
        System.out.println(countVowels("AEIOU") == 5);
        System.out.println(countVowels("bcd") == 0);
        System.out.println(countVowels("") == 0);
    }

    public static int countVowels(String s) {
        int vocals = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            switch (s.toLowerCase().charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u'-> vocals += 1;
            }
        }
        return vocals;
    }

}
