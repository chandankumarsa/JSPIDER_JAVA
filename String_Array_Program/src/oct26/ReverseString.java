package oct26;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverse("java"));
	}
	static String reverse(String s) {
		String s1=" ";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		return s1;
	}

}

