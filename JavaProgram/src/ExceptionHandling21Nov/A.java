package ExceptionHandling21Nov;

public class A {
	public static void main(String[] args) {
		System.out.println(10+20);
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Can not Devide any No by Zero");
		}
		System.out.println(10*2);
	}

}
