package PracticeJava;
public class Permutations {
    public static void main(String[] args) {
        String s = "abcd";  // The string we want to generate permutations of
        generatePermutations(s, 0);  // Start generating permutations from index 0
    }
    static void generatePermutations(String s, int start) {
        if (start == s.length() - 1) {  // Base case: when we've reached the end of the string
            System.out.println(s);  // Print the current permutation
            return;  // End the current function call
        }
        // Loop through each character in the string
        for (int i = start; i < s.length(); i++) {
            s = swap(s, start, i);  // Swap the characters at positions 'start' and 'i'
            generatePermutations(s, start + 1);  // Recursively generate permutations for the next part
            s = swap(s, start, i);  // Swap back to the original string after the recursion
        }
    }
    // Method to swap characters in a string
    static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();  // Convert the string into a character array
        char temp = arr[i];  // Store the character at index 'i'
        arr[i] = arr[j];  // Swap the character at index 'i' with the character at index 'j'
        arr[j] = temp;  // Complete the swap
        return new String(arr);  // Convert the character array back to a string
    }
}
