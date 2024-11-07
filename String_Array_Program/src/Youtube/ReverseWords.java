package Youtube;

public class ReverseWords {
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
