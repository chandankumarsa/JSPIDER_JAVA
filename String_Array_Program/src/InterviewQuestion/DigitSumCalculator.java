package InterviewQuestion;

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int digitSum = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {  // Check if character is a digit
                int digit = ch - '0';      // Convert character to integer by subtracting '0'
                digitSum += digit;
            }
        }
        
        System.out.println("Sum of digits in the string: " + digitSum);
        
        sc.close();  // Close the scanner
    }
}
