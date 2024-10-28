package Oct27;

class A {
    static boolean ispalindrome(String s, int start, int end) {
        s = s.toLowerCase();
        int i = start;
        int j = end;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;  // Decrement j here to move from end towards the start
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "racecar";
        
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (A.ispalindrome(s, i, j)) {
                    System.out.println(s.substring(i, j + 1));
                }
            }
        }
    }
}
