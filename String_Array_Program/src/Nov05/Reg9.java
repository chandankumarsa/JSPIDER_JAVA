package Nov05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg9 {
	public static void main(String[] args) {
		String exp ="ab?";
		String s ="abcabbgajb";
		Pattern p =Pattern.compile(exp);
		Matcher m =p.matcher(s);
		while(m.find()) {
			System.out.println(m.group()+" "+m.start()+" "+m.end());
		}
	}

}
