package Nov05;

public class Reg12 {
	public static void main(String[] args) {
		String s ="a1b2c3d4";
		String[] arr=s.split("[0-9]");
		for(String str:arr) {
			System.out.println(str);
		}
	}

}
