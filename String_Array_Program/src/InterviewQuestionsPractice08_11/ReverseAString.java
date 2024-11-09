package InterviewQuestionsPractice08_11;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		System.out.println("Enter a String To reverse");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char y[]=s.toCharArray();
		int size =s.length();
		char a[]=new char[size];
		int i =0;
		while(i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		
		System.out.println(a);
	}

}
