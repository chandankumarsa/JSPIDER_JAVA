package Oct28;

public class Encode1 {
    public static void main(String[] args) {
        String s = "jsp";
        int k = 13; // The shift value for encoding
        char[] a = s.toCharArray(); // Convert the string to a character array
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray(); // Array of letters

        // Encode each character in the string
        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            // Encode only lowercase letters
            if (c >= 'a' && c <= 'z') {
                a[i] = letters[(c - 'a' + k) % 26]; // Apply the encoding formula
            }
        }

        // Convert the character array back to a string and print it
        String encodedStr = new String(a);
        System.out.println(encodedStr);
    }
}
