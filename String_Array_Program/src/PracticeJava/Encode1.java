package PracticeJava;

public class Encode1 {
	public static void main(String[] args) {
		String s ="jsp";
		int k =13;
		char a[]=s.toCharArray();
		char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i=0;i<a.length;i++) {
			char c=a[i];
			if(c>='a'&&c<='z') {
				a[i]=letter[(c-'a'+k)%26];
			}
		}
		System.out.println(a);
	}

}
