package Homework.hw12;

import java.util.*;

public class RemoveDuplicates {
    public static void main (String [] args){
        System.out.println(removeDuplicates(List.of(3,1,3,2,1)));
        System.out.println(removeDuplicates(List.of(2,2,2)));
        System.out.println(removeDuplicates(List.of(5)));
        System.out.println(removeDuplicates(List.of()));

    }
    public static List<Integer> removeDuplicates(List<Integer> input){
        Set<Integer> linked = new LinkedHashSet<>(input);
        return new ArrayList<>(linked);
    }
}
