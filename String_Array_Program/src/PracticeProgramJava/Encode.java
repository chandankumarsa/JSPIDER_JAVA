package PracticeProgramJava;

public class Encode {
	public static void main(String[] args) {
		String s ="jsp";
		int k=13;
		char a[]=s.toCharArray();
		char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a'&& a[i]<='z') {
				a[i]=letter[(a[i]-'a'+k)%26];
			}
		}
		System.out.println(a);
	}

}
