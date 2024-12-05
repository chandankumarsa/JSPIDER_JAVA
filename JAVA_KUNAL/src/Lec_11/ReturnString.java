package Lec_11;

public class ReturnString {
	public static void main(String[] args) {
		String message =greet("Chandan");
		System.out.println(message);
	}
	static String greet(String name) {
		String s ="Hello "+name;
		return s;
	}

}
