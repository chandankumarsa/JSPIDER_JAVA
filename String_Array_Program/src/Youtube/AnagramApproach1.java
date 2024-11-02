package Youtube;

import java.util.Arrays;

public class AnagramApproach1 {
	public static void main(String[] args) {
		String x="ARADHYA";
		String y="HRADAYA";
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		Boolean result=Arrays.equals(a, b);
		if(result==true) {
			System.out.println("String Are Anagram");
		}else {
			System.out.println("String Are Not Anagram");
		}
		
	}

}
//it cannot accept the uppercase and lowercase and it cannot
//accept blank space