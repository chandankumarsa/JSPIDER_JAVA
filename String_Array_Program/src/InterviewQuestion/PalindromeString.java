package InterviewQuestion;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.println("Enter The String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String org=str;
		String rev ="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println(org+" is a Palindrome String");
		}else {
			System.out.println(org+" is Not a Palindrome String");
		}
	}

}
