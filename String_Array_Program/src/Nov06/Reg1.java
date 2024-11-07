package Nov06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {
	public static void main(String[] args) {
		String exp ="([a-z])\\1+";
		String str ="succcess";
		Pattern p =Pattern.compile(exp);
		Matcher m = p.matcher(str);
		while(m.find()) {
			String s1=m.group();
			String s2 = s1.substring(0,1);
			str = str.replaceAll(s1,s2);
		}
		System.out.println(str);
		
	}

}
