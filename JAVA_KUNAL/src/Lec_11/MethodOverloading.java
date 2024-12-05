package Lec_11;

public class MethodOverloading {
	public static void main(String[] args) {
//		System.out.println(sum(10,20));
//		System.out.println(sum(10,20,33));
//		System.out.println(sum(10,20,30,40));
		System.out.println(sum(10,20,30,40,50));
		
	}

	static int sum(int a, int b) {
		return a+b;
	}
	static int sum(int a, int b,int c) {
		return a+b+c;
	}
	static int sum(int a, int b,int c ,int d) {
		return a+b+c+d;
	}
	static int sum(int a,int b,int c,int d,int e) {
		return a+b+c+d+e;
	}
}
