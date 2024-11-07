package Nov04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexeg1 {
	public static void main(String[] args) {
		String s ="aaaabbbc";
		String exp="aa";
		Pattern p =Pattern.compile(exp);
		Matcher m = p.matcher(s);
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
	}

}
