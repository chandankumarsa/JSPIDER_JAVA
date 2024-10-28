package InterviewQuestion;

import java.util.Scanner;

public class DigitCountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int digitCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {  // Check if the character is a digit
                digitCount++;
            }
        }
        
        System.out.println("Number of digits in the string: " + digitCount);
        
        sc.close();  // Close the scanner
    }
}
