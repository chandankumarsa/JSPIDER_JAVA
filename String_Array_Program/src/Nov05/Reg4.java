package Nov05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg4 {
	public static void main(String[] args) {
		Pattern p =Pattern.compile("a{2}");
		Matcher m =p.matcher("abaacaaad");
		while(m.find()) {
			System.out.println(m.group()+" "+m.start()+" "+m.end());
		}
	}

}
