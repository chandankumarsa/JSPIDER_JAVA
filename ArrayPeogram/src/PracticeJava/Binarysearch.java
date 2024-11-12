package PracticeJava;

public class Binarysearch {
    public static int search(int[] a, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (a[mid] == target) {
            return mid;
        } else if (target < a[mid]) {
            return search(a, target, start, mid - 1);
        } else {
            return search(a, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 13, 1, 15, 16, 19};
        int res = search(a, 15, 0, a.length - 1);
        if (res != -1) {
            System.out.println("Element found at index " + res);
        } else {
            System.out.println("Element is not found");
        }
    }
}
