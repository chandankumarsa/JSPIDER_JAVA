package Youtube;

import java.util.Scanner;

public class RemoveAllWhiteSpace {
public static void main(String[] args) {
	System.out.println("Enter a String to remove all white spaces from a String");
	Scanner sc = new Scanner (System.in);
	String s = sc.nextLine();
	s=s.replaceAll("\\s","");
	System.out.println(s);
}
}
