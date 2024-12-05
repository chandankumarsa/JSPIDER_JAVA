package PracticeProgramJava;

public class Rev2 {
    public static void main(String[] args) {
        String s = "Java is Very Easy";
        char y[] = s.toCharArray();
        int size = y.length;
        char a[] = new char[size];
        int idx = 0;

        for (int i = size - 1; i >= 0; i--) {
            if (y[i] == ' ' || i == 0) {
                int start = (i == 0) ? i : i + 1;
                while (start < size && y[start] != ' ') { // Fixed condition
                    a[idx++] = y[start++];
                }
                if (idx < size) {
                    a[idx++] = ' ';
                }
            }
        }

        System.out.println(new String(a).trim());
    }
}
