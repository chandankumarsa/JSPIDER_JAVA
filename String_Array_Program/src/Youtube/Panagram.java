package Youtube;

public class Panagram {
    public static void main(String[] args) {
        String x = "The five boxing wizards jump quickly";
        x = x.toUpperCase().replace(" ", "");  // Convert to uppercase and remove spaces
        char y[] = x.toCharArray();
        int size = y.length;
        int a[] = new int[26];  // Array to track each letter's presence
        int i = 0;
        while (i != size) {
            int index = y[i] - 'A';  // Subtract ASCII value of 'A' to get index 0-25
            if (index >= 0 && index < 26) {  // Ensure index is within range
                a[index] = 1;
            }
            i++;
        }
        i = 0;
        while (i != 26) {
            if (a[i] == 1) {
                i++;
            } else {
                System.out.println("Non-pangram");
                System.exit(0);
            }
        }
        System.out.println("Pangram");
    }
}
