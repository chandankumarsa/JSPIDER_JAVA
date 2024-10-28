package com.chandan;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();  // 'n' stores the input number

        int mul = 1;  // 'mul' will store the factorial result
        for (int i = 1; i <= n; i++) {
            mul *= i;  // multiplying 'mul' by each number from 1 to 'n'
        }

        System.out.println("The factorial of " + n + " is: " + mul);
    }
}
