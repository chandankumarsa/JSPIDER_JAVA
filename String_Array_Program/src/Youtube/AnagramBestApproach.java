package Youtube;

import java.util.Arrays;

public class AnagramBestApproach {
	public static void main(String[] args) {
		String x = "HE Is aRAdHyA";
		String y ="is he HraDaya";
		x=x.replace(" ", "");
		y = y.replace(" ", "");
		x=x.toLowerCase();
		y = y.toLowerCase();
		char a[] =x.toCharArray();
		char b[]=y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		Boolean result =Arrays.equals(a,b);
		if(result == true) {
			System.out.println("String are Anagram");
		}else {
			System.out.println("String are Not Anagram");
		}
	}

}
