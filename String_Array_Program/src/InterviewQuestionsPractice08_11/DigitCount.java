package InterviewQuestionsPractice08_11;

import java.util.Scanner;

public class DigitCount {
public static void main(String[] args) {
	System.out.println("ENter a String To count Digit");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int count =0;
	for(int i =0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='0'&& c<='9') {
			count++;
		}
	}
	System.out.println("Total Digit in this String is "+count);
	
}
}
