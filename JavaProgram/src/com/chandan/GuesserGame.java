package com.chandan;

import java.util.Scanner;

public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = (int)(Math.random() * 9) + 1;
         System.out.println(n); // Uncomment if you want to display the random number for testing
        int score = 0;

        for (int i = 3; i >= 1; i--) {
            System.out.println("Guess a Number (1-9)");
            int num = sc.nextInt();
            if (n == num) {
                System.out.println("Your guess is correct");
                score += 10;
                n = (int)(Math.random() * 9) + 1;
                 System.out.println(n); // Uncomment if you want to display the new random number for testing
            } else {
                System.out.println("You have " + (i - 1) + " chances left");
            }
        }
        
        // Print the final score after all attempts
        System.out.println(name + ", your final score is: " + score);

    }
}




































/*
Guesser Game using Random Method to generate a random number:

int n = (int)(Math.random() * 9) + 1;

Explanation:
- Math.random() generates a random decimal value between 0.0 and 1.0 (exclusive of 1).
- By multiplying it with 9, we get a decimal value between 0.0 and 8.999... .
- The (int) type casting converts the decimal to an integer, removing the fractional part. 
  So, it changes the range to integers between 0 and 8.
- Adding 1 shifts the range from 0-8 to 1-9, so the final result is a random integer between 1 and 9.
*/
