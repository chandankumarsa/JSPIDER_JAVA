package JavaPractices;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        System.out.println("Enter A String To count vowel:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] y = s.toCharArray();
        int size = y.length;
        int vowel = 0;
        int consonant = 0;
        int specialCharacter = 0;
        int i = 0;
        
        while (i != size) {
            if ((y[i] >= 'A' && y[i] <= 'Z') || (y[i] >= 'a' && y[i] <= 'z')) {
                // Check if the character is a vowel
                if (y[i] == 'A' || y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] == 'U' ||
                    y[i] == 'a' || y[i] == 'e' || y[i] == 'i' || y[i] == 'o' || y[i] == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            } else {
                specialCharacter++;
            }
            i++;
        }
        
        System.out.println("Vowel count: " + vowel);
        System.out.println("Consonant count: " + consonant);
        System.out.println("Special character count: " + specialCharacter);
    }
}