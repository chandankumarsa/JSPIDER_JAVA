package oct26;

public class Demo3 {
	public static void main(String[] args) {
		Object o1="abcd";
		System.out.println(o1);
//		String(o1.equalsIgnoreCase("ABCD"));//error we have to DOwncasting
		System.out.println(((String) o1).equalsIgnoreCase("ABCD"));
	}

}
