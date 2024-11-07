package Nov05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg7 {
	public static void main(String[] args) {
		Pattern p =Pattern.compile("ab+");
		Matcher m =p.matcher("abcdabbeagcb");
		while(m.find()){
			System.out.println(m.group()+" "+m.start()+" "+m.end());
		}
	}

}
