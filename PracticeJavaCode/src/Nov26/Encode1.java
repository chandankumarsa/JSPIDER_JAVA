package Nov26;

public class Encode1 {
	public static void main(String[] args) {
		String s ="jsp";
		char a[]=s.toCharArray();
		char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		int k=13;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a'&& a[i]<'z') {
				a[i]=letter[(a[i]-'a'+k)%26];
			}
		}
		System.out.println(a);
	}

}
