package Lec_11;

import java.util.Arrays;

public class VarArgs_OR_VariableLengthArguments {
	public static void main(String[] args) {
		fun(10,20,30,50,62,69);
	}
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}

}
