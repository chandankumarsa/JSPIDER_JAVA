package com.chandan;

import java.util.Scanner;
public class PrecedingSucceedingValues {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n > 0 && n % 2 == 0) {
            // Print preceding values for positive even numbers
            System.out.println((n - 2) + "," + (n - 4) + "," + (n - 6));
        } else if (n < 0 && n % 2 != 0) {
            // Print succeeding values for negative odd numbers
            System.out.println((n + 2) + "," + (n + 4) + "," + (n + 6));
        } else {
            System.out.println("The number does not meet the conditions.");
        }
        
        sc.close();
    }
}



/*write a java program to print preceding values if the number is positive even
print the succeeding Value if the given number is negative odd
Preceding value: The number just before a given number.
Succeeding value: The number just after a given number.*/