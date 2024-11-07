package Youtube;

public class Encode {
    public static void main(String[] args) {
        String s = "jsp";
        int k = 13;
        char[] a = s.toCharArray();
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] encodedArray = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            encodedArray[i] = letters[(c - 'a' + k) % 26];
        }

        for (char ch : encodedArray) {
            System.out.print(ch);
        }
    }
}
