package Youtube;

public class SwapToString {
	public static void main(String[] args) {
		String a ="ABC";
		String b ="Tech";
		String temp ="";
		System.out.println("Beore Swapping "+a);
		System.out.println("Before Swapping "+b);
		temp =a;
		a=b;
		b=temp;
		System.out.println("After Swapping "+a);
		System.out.println("After Swapping "+b);
	}

}


//swap two String without using A Third String