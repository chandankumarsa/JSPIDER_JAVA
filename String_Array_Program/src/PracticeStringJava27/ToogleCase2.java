package PracticeStringJava27;

public class ToogleCase2 {
	public static void main(String[] args) {
		String s ="abCd";
		char a[]=s.toCharArray();
		int size =a.length;
		int i=0;
		while(i!=size) {
			if(a[i]>='A'&& a[i]<='Z') {
				a[i]=(char)(a[i]+32);
			}else if(a[i]<='a'&& a[i]<='z') {
				a[i]=(char)(a[i]-32);
			}
			i++;
		}
		System.out.println(a);
	}

}
