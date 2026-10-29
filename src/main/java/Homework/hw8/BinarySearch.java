package Homework.hw8;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(a, 1 ) == 1);
        System.out.println(binarySearch(a, 9 ) == 9);
        System.out.println(binarySearch(a, 5 ) == 5);
        System.out.println(binarySearch(a, 4 ) == -1);
        System.out.println(binarySearch(a, 0 ) == -1);
        System.out.println(binarySearch(a, 10 ) == -1);
        System.out.println(binarySearch(new int[] {5}, 5) == 5);
        System.out.println(binarySearch(new int[] {}, 5 ) == -1);
    }

    public static int binarySearch(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == target) {
                return a[mid];
            }else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
