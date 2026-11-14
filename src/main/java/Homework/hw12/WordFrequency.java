package Homework.hw12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class WordFrequency {
    public static void main (String []args){
        System.out.println(countWords(" The cat, and the hat ! "));
        System.out.println(countWords(" Hi hi "));
        System.out.println(countWords(""));
        System.out.println(countWords("Școala e bună, școala!"));

    }
    public static Map<String, Integer> countWords(String text){
        Map<String, Integer> frequency = new HashMap<>();
        String punctuation = text.replaceAll("\\p{Punct}", "");
        String key = punctuation.trim().toLowerCase();
        String[] words = key.split("\\s+");
        for(String word : words){
            if (word.isEmpty()) continue;
            frequency.put(word,frequency.getOrDefault(word,0)+1);
        }
        return frequency;
    }
}