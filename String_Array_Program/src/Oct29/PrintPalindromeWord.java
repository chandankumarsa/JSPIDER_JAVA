package Oct29;

public class PrintPalindromeWord {
    public static void main(String[] args) {
        String s = "Madam is madam";
        String[] str = s.split(" "); // Split by space to get words
        for (int i = 0; i < str.length; i++) {
            if (ispalindrome(str[i])) // Check if the word is a palindrome
                System.out.println(str[i]); // Print the palindrome word
        }
    }

    public static boolean ispalindrome(String s) { // Corrected method signature
        s = s.toLowerCase(); // Convert to lower case for comparison
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false; // Return false if characters don't match
            i++;
            j--;
        }
        return true; // Return true if it is a palindrome
    }
}



//// Write a java program to print palindrome words in the Given String
