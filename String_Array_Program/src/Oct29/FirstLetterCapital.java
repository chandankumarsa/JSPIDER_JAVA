package Oct29;

public class FirstLetterCapital {
    public static void main(String[] args) {
        System.out.println(convert("chandan Kumar sahu"));
    }

    public static String convert(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is lowercase and either the first character or preceded by a space
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                if (i == 0 || ch[i - 1] == ' ') {
                    // Convert to uppercase
                    ch[i] = (char) (ch[i] - 32);
                }
            }
        }
        return new String(ch);
    }
}
