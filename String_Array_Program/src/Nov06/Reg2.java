package Nov06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {
	public static void main(String[] args) {
		String exp ="([a-z])\\1*";
		String str ="success";
		Pattern p =Pattern.compile(exp);
		Matcher m =p.matcher(str);
		String s2="";
		while(m.find()) {
			String s1=m.group();
			s2=s2+s1.length()+s1.substring(0,1);
		}
		System.out.println(s2);
	}

}
//count character