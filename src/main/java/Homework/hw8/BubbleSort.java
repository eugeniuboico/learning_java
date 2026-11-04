package Homework.hw8;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(sort( new int[]{5, 1, 4, 2, 8}));
        System.out.println(sort( new int[]{3, 3, 1}));
        System.out.println(sort( new int[]{-2, 0, -5}));
        System.out.println(sort( new int[]{1, 2, 3}));
        System.out.println(sort( new int[]{7}));
        System.out.println(sort( new int[]{}));
    }

    public static String sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }

            }
        }
        return Arrays.toString(a);
    }
}
