package Nov04;

public class AnagramStringOrNot {
    public static void main(String[] args) {
        System.out.println(isAnagram("Ramana", "amaRan")); // true
    }

    public static boolean isAnagram(String s1, String s2) {
        // Convert both strings to lower case for case insensitivity
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Check if lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Loop through each character in s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            // Replace the first occurrence of ch in s2 with an empty string
            s2 = s2.replaceFirst(Character.toString(ch), "");
        }

        // If s2 is empty, all characters matched
        return s2.isEmpty();
    }
}
