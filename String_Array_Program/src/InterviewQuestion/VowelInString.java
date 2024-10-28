package InterviewQuestion;

import java.util.Scanner;

public class VowelInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();
        
        int vowelCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels in the string: " + vowelCount);
        
        sc.close();  // Close the scanner
    }
}
