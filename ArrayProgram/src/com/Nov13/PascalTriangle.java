package com.Nov13;

public class PascalTriangle {
    int n = 5;
    int[][] a = new int[n][];

    public PascalTriangle() {
        // Initialize Pascal's triangle
        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
    }

    public void printPascalTriangle() {
        int sp = n - 1;
        for (int[] row : a) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
            sp--;
        }
    }

    public static void main(String[] args) {
        PascalTriangle triangle = new PascalTriangle();
        triangle.printPascalTriangle();
    }
}
