package Homework.hw5;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Expected true. Result: " + (grade(100) == "A"));
        System.out.println("Expected true. Result: " + (grade(90) == "A"));
        System.out.println("Expected true. Result: " + (grade(89) == "B"));
        System.out.println("Expected true. Result: " + (grade(60) == "D"));
        System.out.println("Expected true. Result: " + (grade(59) == "F"));
        System.out.println("Expected true. Result: " + (grade(0) == "F"));
        System.out.println("Expected true. Result: " + (grade(-1) == "Invalid"));
        System.out.println("Expected true. Result: " + (grade(101) == "Invalid"));
        System.out.println("Expected true. Result: " + (grade(80) == "B"));
        System.out.println("Expected true. Result: " + (grade(79) == "C"));
        System.out.println("Expected true. Result: " + (grade(70) == "C"));
        System.out.println("Expected true. Result: " + (grade(69) == "D"));
        System.out.println("Expected true. Result: " + (grade(95) == "A"));
        System.out.println("Expected true. Result: " + (grade(85) == "B"));
        System.out.println("Expected true. Result: " + (grade(75) == "C"));
        System.out.println("Expected true. Result: " + (grade(65) == "D"));
        System.out.println("Expected true. Result: " + (grade(30) == "F"));
        System.out.println("Expected true. Result: " + (grade(150) == "Invalid"));
        System.out.println("Expected true. Result: " + (grade(Integer.MAX_VALUE) == "Invalid"));
        System.out.println("Expected true. Result: " + (grade(Integer.MIN_VALUE) == "Invalid"));
    }

    // grade calculator
    static String grade(int score) {
        if(score > 100) {
            return "Invalid";
        }else if(score > 89) { // 90 - 100 A
            return "A";
        }else if(score > 79) { // 80 - 89 B
            return "B";
        }else if(score > 69) { // 70 - 79 C
            return "C";
        }else if(score > 59) { // 60 - 69 D
            return "D";
        }else if(score > -1) { // 0 - 59 F
            return "F";
        }else {
            return "Invalid";
        }
    }
}
