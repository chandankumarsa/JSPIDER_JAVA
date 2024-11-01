package Practice;

public class Len {
	public static void main(String[] args) {
		String s ="chandan Kumar Sahu";
		s = s.concat("\0");
		char [] a= s.toCharArray();
		int count =0;
		int i =0;
		while(a[i]!='\0') {
			count++;
			i++;
		}
		System.out.println(count);
	}

}
