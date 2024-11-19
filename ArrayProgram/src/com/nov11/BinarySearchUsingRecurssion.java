package com.nov11;

public class BinarySearchUsingRecurssion {
    public static void main(String[] args) {
        int[] a = {2, 13, 15, 19};
        int res = search(a, 15, 0, a.length - 1);
        if (res != -1) {
            System.out.println("Element found at index: " + res);
        } else {
            System.out.println("Element not found");
        }
    }
  public static int search(int[] a, int target, int start, int end) {
        if (start > end) {
            // Print message when element is not found
            return -1;  // Element not found
        }
        
        int mid = (start + end) / 2;
        
        if (a[mid] == target) {
            return mid;  // Element found
        } else if (target < a[mid]) {
            return search(a, target, start, mid - 1);  // Search left half
        } else {
            return search(a, target, mid + 1, end);  // Search right half
        }
    }
}
