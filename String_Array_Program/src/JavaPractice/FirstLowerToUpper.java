package JavaPractice;

import java.util.Scanner;

public class FirstLowerToUpper {
	public static void main(String[] args) {
		System.out.println("Enter A String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char y[]=s.toCharArray();
		int size = y.length;
		y[0]=(char)(y[0]-32);
		int i =1;
		while(i!=size) {
			if(y[i]==' ') {
				y[i+1]=(char)(y[i+1]-32);
			}
			i++;
		}
		System.out.println(y);
	}

}
