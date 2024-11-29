package PracticeStringJava27;

public class Encode {
	public static void main(String[] args) {
		String s ="jsp";
		char a[]=s.toCharArray();
		char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		int k=13;
		for(int i=0;i<s.length();i++){
			if(a[i]>='a'&& a[i]<='z') {
				a[i]=letter[(a[i]-'a'+k)%26];
			}
		}
		System.out.println(a);
		
	}

}
