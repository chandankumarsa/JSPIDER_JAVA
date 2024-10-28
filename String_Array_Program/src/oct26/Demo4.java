package oct26;

public class Demo4 {
	public static void main(String[] args) {
		String s1="java";
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println("............................");
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
	}

}
