package PRACTICE;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 8, 6, 5, 9, 2};
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(a));

        // Selection Sort logic directly in the main method
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element found with the current element at index i
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

        // Print the array after sorting
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(a));
    }
}
