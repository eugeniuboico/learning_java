import java.util.Scanner;

public class MyScanner {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // A > B
        // A > C

        if (a > b) {
            if (a > c) {
                System.out.println(a + "mai mare");
            } else {
                System.out.println(c + "mai mare");
            }
        } else if (b > a) {
            if (b > c) {
                System.out.printf(b + "mai mare");
            } else {
                System.out.println(c + "mai mare");
            }
        } else if (c > a) {
            if (c > b) {
                System.out.println(c + "mai mare");
            }
        }


    }
}
