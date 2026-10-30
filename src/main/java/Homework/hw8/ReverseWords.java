package Homework.hw8;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("<3 sir you Thank"));
        System.out.println(reverseWords("I love Java").equals("Java love I"));
        System.out.println(reverseWords("Hello").equals("Hello"));
        System.out.println(reverseWords("").equals(""));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        int j = 0;
        String[] cWords = words.clone();
        for (int i = words.length - 1; i >= 0; i--) {
            words[j] = cWords[i];
            j++;
        }
        String results = String.join(" ", words);
        return results;
    }
}
