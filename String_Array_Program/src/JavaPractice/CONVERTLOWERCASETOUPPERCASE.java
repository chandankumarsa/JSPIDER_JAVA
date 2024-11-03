package JavaPractice;

import java.util.Scanner;

public class CONVERTLOWERCASETOUPPERCASE {
	public static void main(String[] args) {
		System.out.println("Enter A String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char y[] = s.toCharArray();
		int size = y.length;
		int i =0;
		while(i!=size) {
			if(y[i]!=' ') {
				y[i] =(char) (y[i]-32);
			}
			i++;
		}
		System.out.println(y);
	}

}
