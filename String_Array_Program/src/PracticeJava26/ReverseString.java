package PracticeJava26;

public class ReverseString {
	public static void main(String[] args) {
		String s = "chandan Kumar";
		char y[] = s.toCharArray();
		int size = y.length;
		char a[] = new char[size];
		int i = 0;
		while (i != size) {
			a[size - i - 1] = y[i];
			i++;
		}
		System.out.println(a);
	}

}
