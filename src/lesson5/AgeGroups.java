package lesson5;

public class AgeGroups {
    public static void main(String[] args) {
        System.out.println("For age " + 13 + " you are a - " + category( 13));
    }

    public static String category(int age) {
        if (age < 0) {
            return "Invalid Age";
        }
        if (age < 12) {
            return "Child";
        }
        if (age < 18) {
            return "Teen";
        }
        if (age < 65) {
            return "Adult";
        }else {
            return "Senior";
        }
    }
}
