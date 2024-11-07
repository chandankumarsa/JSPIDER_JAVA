package Nov05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg5 {
	public static void main(String[] args) {
		Pattern p =Pattern.compile("a{2,3}");
		Matcher m =p.matcher("abaacaaaad");
		while(m.find()){
			System.out.println(m.group()+" "+m.start()+" "+m.end());
		}
	}

}
