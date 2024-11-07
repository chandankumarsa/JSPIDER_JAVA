package PracticeJava;

public class Permutations1 {
public static void main(String[] args) {
	String s ="abcd";
	ganeratePermutation(s,0);
}
static void ganeratePermutation(String s ,int start) {
	if(start==s.length()-1) {
		System.out.println(s);
		return;
	}
	for(int i=start;i<=s.length();i++) {
		s=swap(s,start,i);
		ganeratePermutation(s, start+1);
		s=swap(s,start,i);
	}
}
static String swap(String s, int i, int j) {
	char[] arr=s.toCharArray();
	char temp =arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	return new String(arr);
}
}
