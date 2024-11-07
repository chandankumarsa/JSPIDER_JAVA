package Nov06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg4 {
	public static void main(String[] args) {
		String exp="[0-9]{2}";
		String str ="abc34fgh";
		Pattern p=Pattern.compile(exp);
		Matcher m =p.matcher(str);
		System.out.println(m.find());
		System.out.println(m.matches());
	}

}
