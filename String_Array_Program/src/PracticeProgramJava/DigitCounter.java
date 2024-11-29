package PracticeProgramJava;

import java.util.Iterator;

public class DigitCounter {
	public static void main(String[] args) {
		String s ="chan69dan961234";
		char y[]=s.toCharArray();
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(y[i]>='0'&& y[i]<='9') {
				count++;
			}
		}
		System.out.println("Toaal Digit in a String is "+count);
	}

}
