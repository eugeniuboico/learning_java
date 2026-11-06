package Homework.hw12;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class BracketValidator {
    static public void main(String[] args) {
        System.out.println(isValid("([]{})"));
        System.out.println(isValid("(a+b)*[c]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("("));
        System.out.println(isValid(")"));
    }

    static public boolean isValid(String s){
        String result = s.replaceAll("[^(){}\\[\\]]", "");
        char[] cArray = result.toCharArray();
        ArrayList<Character> deque = new ArrayList<>();
        if (cArray[0] == (')') || cArray[0] == ('}') || cArray[0] == (']')) {
            return false;
        } else {
            for (int i = 0; i < cArray.length; i++) {
                deque.add(cArray[i]);
                if (i - 1 != -1) {
                    for(int j = 1; j < deque.size(); j++) {
                        if (deque.get(j) == ')' && deque.get(j - 1) == '(') {
                            deque.remove(j);
                            deque.remove(j - 1);
                        } else if (deque.get(j) == '}' && deque.get(j - 1) == '{') {
                            deque.remove(j);
                            deque.remove(j - 1);
                        } else if (deque.get(j) == ']' && deque.get(j - 1) == '[') {
                            deque.remove(j);
                            deque.remove(j - 1);
                        }
                    }
                }
            }
            if(deque.isEmpty()) {
                return true;
            }else {
                return false;
            }
        }

    }
}
