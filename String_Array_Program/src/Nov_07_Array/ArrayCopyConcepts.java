package Nov_07_Array;

import java.util.Arrays;

public class ArrayCopyConcepts {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		System.out.println("a = "+Arrays.toString(a));
		System.arraycopy(a, 0, a, 2, 3);
		System.out.println("a = "+Arrays.toString(a));
	}

}
