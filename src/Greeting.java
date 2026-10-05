import java.sql.SQLOutput;
import java.util.Scanner;

public class Greeting {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hellom, " + name);

        System.out.println("What us your age?");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + ". Yur age is " + age);

        if (age < 18) {
            System.out.println("No piva");
        } else {
            System.out.println("Yes piva");
        }
    }



}