package Nov05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1 {
	public static void main(String[] args) {
		Pattern p =Pattern.compile("a");
		Matcher m =p.matcher("banana");
		while(m.find()) {
			System.out.println(m.group()+" "+m.start()+" "+m.end());
		}
	}

}