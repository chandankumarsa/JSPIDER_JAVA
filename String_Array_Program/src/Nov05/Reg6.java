package Nov05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg6 {
	public static void main(String[] args) {
		Pattern p =Pattern.compile("[0-9]{2}");
		Matcher m =p.matcher("a1b346d1468f");
		while(m.find()){
			System.out.println(m.group()+" "+m.start()+" "+m.end());
		}
	}

}
