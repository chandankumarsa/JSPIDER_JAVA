package PracticeJava26;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		System.out.println("ENter  A String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch>='0'&& ch<='9') {
				count++;
			}
		}
		System.out.println("Total count digit is "+count);
	}
	
}
