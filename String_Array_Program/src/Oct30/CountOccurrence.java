package Oct30;

public class CountOccurrence {
    public static void main(String[] args) {
        String s1 = "aaabbaa";
        
        while(s1.length() > 0) {
            char c = s1.charAt(0); // Get the first character
            String s2 = s1.replace(c + "", ""); // Remove all occurrences of 'c' in s1
            int count = s1.length() - s2.length(); // Count occurrences of 'c'
            System.out.println(c + "=" + count); // Print the character and its count
            s1 = s2; // Update s1 to s2 to remove counted characters
        }
    }
}
/*
 output 
 
a=5
b=2
*/