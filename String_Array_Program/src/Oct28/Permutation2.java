package Oct28;
public class Permutation2 {
    public static void main(String[] args) {
        String s = "abcd";
        char[] chars = s.toCharArray(); // Convert the string to a character array
        int n = chars.length;
        // Generate all permutations using a recursive backtracking approach
        generatePermutations(chars, 0, n);
    }
    static void generatePermutations(char[] chars, int index, int n) {
        if (index == n) {
            System.out.println(new String(chars)); // Print the current permutation
            return;
        }
        for (int i = index; i < n; i++) {
            // Swap characters at index and i
            char temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;

            // Recur for the next index
            generatePermutations(chars, index + 1, n);

            // Backtrack to restore the original configuration
            temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;
        }
    }
}
