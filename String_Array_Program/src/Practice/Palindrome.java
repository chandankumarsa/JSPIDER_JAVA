package Practice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	char y[]= s.toCharArray();
	int size = y.length;
	char a[]=new char[size];
	int i =0;
	while(i!=size) {
		a[size-1-i]=y[i];
		i++;
	}
	i=0;
	while(i!=size){
		if(a[i]!=y[i]) {
			System.out.println("Not A Palindrome");
			System.exit(0);
		}else {
			i++;
			continue;
		}
	}
	System.out.println("palindrome");
	
	}

}
