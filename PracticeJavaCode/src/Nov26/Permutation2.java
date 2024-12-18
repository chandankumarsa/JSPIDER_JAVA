package Nov26;

public class Permutation2 {
	public static void main(String[] args) {
		String s = "1234";
		permutation(s, 0, s.length() - 1);

	}

	static void permutation(String s, int start, int end) {
		if (start > end) {
			System.out.println(s);
			return;
		}
		for (int i = start; i <= end; i++) {
			String s1 = swap(s, start, i);
			permutation(s1, start + 1, end);
		}
	}

	static String swap(String s, int i, int j) {
		char a[] = s.toCharArray();
		char temp =a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String (a);
	}
}
