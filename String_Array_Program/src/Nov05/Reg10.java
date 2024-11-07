package Nov05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String exp="[0-9]+";
		String s =sc.next();
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		int sum =0;
		while(m.find()) {
			sum +=Integer.parseInt(m.group());
		}
		System.out.println(sum);
	}

}
