package PracticeJava;

import java.util.Scanner;

public class VowelCount {
public static void main(String[] args) {
	System.out.println("Enter a Strings");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	int vowel =0;

	for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowel++;
		}
	}
	System.out.println("count vowel is "+vowel);
}
}