import java.util.Scanner;

public class DupeMyScanner {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // A > B
        // A > C

        if (a >= b || a >= c) {
            System.out.println(a + " mai mare");
        }
        else if (b >= a || b >= c) {
            System.out.println(b + " mai mare");
        }
        else if (c >= b || c >= a) {
            System.out.println(b + " mai mare");
        }


    }
}
