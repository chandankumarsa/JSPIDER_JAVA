package PRACTICE;
import java.util.Arrays;

public class BaubleSort {
    public static void main(String[] args) {
        int[] a = {3, 9, 4, 6, 5, 7, 8};
        
        // Print message and original array before sorting
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(a));

        // Bubble Sort logic directly in the main method
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }

        // Print message and sorted array after sorting
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(a));
    }
}
