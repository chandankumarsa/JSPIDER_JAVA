package Oct29;
public class ReverseSentenceWithoutUsingSplit {
    public static void main(String[] args) {
        String s = "java is easy"; 
        System.out.println(reverseSentence(s)); 
    }

    public static String reverseSentence(String s) {
        StringBuilder reversed = new StringBuilder(); 
        int end = s.length() - 1; 

        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }

            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }

            reversed.append(s.substring(start + 1, end + 1)); 

            if (end > 0) {
                reversed.append(' ');
            }

            end = start - 1;
        }

        return reversed.toString(); 
    }
}
