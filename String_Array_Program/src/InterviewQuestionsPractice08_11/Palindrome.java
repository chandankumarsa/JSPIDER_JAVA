package InterviewQuestionsPractice08_11;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("ENter a String to check palindrome or not");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char y[]=s.toCharArray();
		int size =s.length();
		char a[]=s.toCharArray();
		int i =0;
		while(i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		i=0;
		while(i!=size) {
			if(y[i]!=a[i]) {
				System.out.println("Not a Palindrome String");
				return;
			}else {
				i++;
				continue;
			}
		}
		System.out.println("Palindrome String");
		
	}

}
