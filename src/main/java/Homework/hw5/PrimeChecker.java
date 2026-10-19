package Homework.hw5;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println("Expected true. Result: " + (isPrime(2) == true));
        System.out.println("Expected true. Result: " + (isPrime(3) == true));
        System.out.println("Expected false. Result: " + (isPrime(4) == false));
        System.out.println("Expected true. Result: " + (isPrime(17) == true));
        System.out.println("Expected true. Result: " + (isPrime(97) == true));
        System.out.println("Expected false. Result: " + (isPrime(1) == false));
        System.out.println("Expected false. Result: " + (isPrime(0) == false));
        System.out.println("Expected false. Result: " + (isPrime(-7) == false));
        System.out.println("Expected false. Result: " + (isPrime(9) == false));
        System.out.println("Expected false. Result: " + (isPrime(25) == false));
        System.out.println("Expected false. Result: " + (isPrime(49) == false));
        System.out.println("Expected false. Result: " + (isPrime(91) == false));
        System.out.println("Expected false. Result: " + (isPrime(-2) == false));
        System.out.println("Expected true. Result: " + (isPrime(2147483647) == true));
        System.out.println("Expected false. Result: " + (isPrime(2147483646) == false));
    }

    public static boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
