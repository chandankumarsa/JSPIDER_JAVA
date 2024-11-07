package Nov04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
public static void main(String[] args) {
	String s ="abcdedfddd";
	String exp="[abcd][d]";
	Pattern p =Pattern.compile(exp);
	Matcher m =p.matcher(s);
	while(m.find()) {
		System.out.println(m.group());
	}
}
}
