package Nov04;
public class MissingVowels {
    public static void main(String[] args) {
        String input = "AMARACH";
        String vowels = "AEIOU";
        String missingVowels = "";

        // Convert input string to uppercase for consistent comparison
        input = input.toUpperCase();
        // Check for each vowel in the string
        for (int i = 0; i < vowels.length(); i++) {
            char vowel = vowels.charAt(i);
            if (input.indexOf(vowel) == -1) {
                missingVowels += vowel;
            }
        }
        System.out.println("Missing Vowels: " + missingVowels);
    }
}

