package Youtube;

import java.util.Scanner;

public class PrintPalindromeWordINSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        sentence = sentence.toUpperCase();
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Loop through each word and check if it's a palindrome
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }
    
    // Method to check if a given word is a palindrome
    static boolean isPalindrome(String word) {
        char[] characters = word.toCharArray();
        int size = characters.length;
        
        // Create a reversed character array
        char[] reversed = new char[size];
        for (int i = 0; i < size; i++) {
            reversed[size - 1 - i] = characters[i];
        }
        
        // Compare original and reversed arrays
        for (int i = 0; i < size; i++) {
            if (characters[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
}

