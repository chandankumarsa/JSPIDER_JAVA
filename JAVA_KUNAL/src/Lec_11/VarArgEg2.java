package Lec_11;

import java.util.Arrays;

public class VarArgEg2 {
	public static void main(String[] args) {
		fun(10,20);
		fun("chandan","Kumar","Sahu");
	}
	static void fun(int  ...v) {
		System.out.println(Arrays.toString(v));
	}
	static void fun(String  ...v) {
		System.out.println(Arrays.toString(v));
	}

}
