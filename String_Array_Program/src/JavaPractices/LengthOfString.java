package JavaPractices;

import java.util.Scanner;

public class LengthOfString {
	public static void main(String[] args) {
		System.out.println("Enter a Strings");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		s=s.concat("\0");
		char y[]=s.toCharArray();
		int i =0;
		int count =0;
		while(y[i]!='\0') {
			count++;
			i++;
		}
		System.out.println(count);
	}

}
