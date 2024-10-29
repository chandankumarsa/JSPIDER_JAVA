package Oct29;

public class ReverseWordWithoutUsingSplit {
    public static void main(String[] args) {
        String s = "java is easy";
        System.out.println(rev(s));
    }

    public static String rev(String s) {
        int i = 0;
        int j = 0;
        String s2 = ""; // Initialize result string without leading space

        while (j < s.length()) {
            // Find the end of the current word
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }

            // Temporary string to hold the current word in reverse
            String temp = "";
            int k = j - 1; // Set k to the last character of the current word

            // Reverse the current word
            while (k >= i) {
                temp += s.charAt(k);
                k--;
            }

            // Append the reversed word to the result string
            s2 += temp;

            // Add a space if not at the end of the string
            if (j < s.length()) {
                s2 += " ";
            }

            // Move to the start of the next word
            j++;
            i = j;
        }
        return s2;
    }
}
