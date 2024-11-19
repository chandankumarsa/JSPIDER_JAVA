package com.Nov13;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 4, 5, 6, 7, 8, 8, 9};
        int n = arr.length;

        // Step 1: Sort the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Step 2: Remove duplicates by shifting elements
        int uniqueCount = 1; // First element is unique
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        // Step 3: Print the result without duplicates
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
