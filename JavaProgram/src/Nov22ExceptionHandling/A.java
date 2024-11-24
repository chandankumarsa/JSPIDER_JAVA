package Nov22ExceptionHandling;

public class A {
	public static void main(String[] args) {
		int a[]= {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[2]);
		try {
			System.out.println(a[10]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
//			System.out.println(e.getStackTrace());
		}
	}

}
