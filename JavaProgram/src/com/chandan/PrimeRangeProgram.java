package com.chandan;

import java.util.Scanner;

public class PrimeRangeProgram {
    public static void main(String[] args) {
        System.out.println("Enter a range (start and end):");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        
        for (int j = start; j <= end; j++) {
            int n = j;
            boolean flag = true;

            if (n <= 1) {
                flag = false;
            } else {
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println(j);
            }
        }
    }
}
