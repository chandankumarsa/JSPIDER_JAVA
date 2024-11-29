package PracticeStringJava27;

public class AnagramString {
    public static void main(String[] args) {
        System.out.println(isAnagram("ramana", "amaran"));
    }

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            s2 = s2.replaceFirst(Character.toString(ch), " ");
        }
        
        return s2.trim().isEmpty();  // Remove leading/trailing spaces and check if empty
    }
}
