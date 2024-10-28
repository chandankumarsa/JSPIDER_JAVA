package Oct28;

public class Encode {
    public static void main(String[] args) {
        String s = "jsp";
        String encodedStr = encode(s, 13);
        System.out.println(encodedStr);
    }

    static String encode(String s, int k) {
        char[] a = s.toCharArray();
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            a[i] = letters[(c - 'a' + k) % 26];
        }

        return new String(a);
    }
}
