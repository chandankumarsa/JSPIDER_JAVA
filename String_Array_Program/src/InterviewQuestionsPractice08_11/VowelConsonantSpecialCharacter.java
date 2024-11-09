package InterviewQuestionsPractice08_11;

import java.util.Scanner;
public class VowelConsonantSpecialCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int size = s.length();
        char[] y = s.toCharArray();
        
        int vowel = 0;
        int consonant = 0;
        int specialCharacter = 0;
        
        for (int i = 0; i < size; i++) {
            if ((y[i] >= 'a' && y[i] <= 'z') || (y[i] >= 'A' && y[i] <= 'Z')) {
                if (y[i] == 'A' || y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] == 'U' || y[i] == 'a' || y[i] == 'e' || y[i] == 'i' || y[i] == 'o' || y[i] == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            } else {
                specialCharacter++;
            }
        }
        
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Special Characters: " + specialCharacter);
    }
}
