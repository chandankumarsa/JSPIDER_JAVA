package Oct29;

public class ReverseTheWords {
    public static void main(String[] args) {
        String s = "Java is Very Easy";
        String temp = "";
        String[] str = s.split(" ");
        
        for (int i = str.length - 1; i >= 0; i--) {
            temp += str[i];
            if (i != 0) {
                temp += " ";
            }
        }
        
        System.out.println(temp);
    }
}

// Questions:
// 1. How to reverse the order of words in a sentence in Java?
// 2. How to avoid adding an extra space after the last word?
// 3. What does the split(" ") method do in Java?
// 4. How to iterate over an array in reverse order using a for loop?
// 5. How does Java handle string concatenation within a loop?
// 6. How to store multiple words from a sentence in an array?
