package com.Nov08;

public class SmallestElementsInArray {
    public static void main(String[] args) {
        int[] a = {12, 5, 18, 7, 3, 9}; // Declare and initialize the array
        int smallest = a[0]; // Initialize smallest with the first element

        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Smallest element: " + smallest); // Print the smallest element
    }
}
